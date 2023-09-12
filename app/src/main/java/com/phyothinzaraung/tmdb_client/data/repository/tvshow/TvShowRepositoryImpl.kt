package com.phyothinzaraung.tmdb_client.data.repository.tvshow

import android.util.Log
import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShow
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.phyothinzaraung.tmdb_client.domain.repository.TvShowRepository
import java.lang.Exception

class TvShowRepositoryImpl(
    private val tvShowRemoteDataSource: TvShowRemoteDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource,
    private val tvShowCacheDataSource: TvShowCacheDataSource
): TvShowRepository {
    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        val newTvShowList = getTvShowsFromApi()
        tvShowLocalDataSource.clearAll()
        tvShowLocalDataSource.saveTvShowsFromDB(newTvShowList)
        tvShowCacheDataSource.saveTvShowsToCache(newTvShowList)
        return newTvShowList
    }

    suspend fun getTvShowsFromApi(): List<TvShow>{
        lateinit var tvShowList: List<TvShow>
        try {
            val response = tvShowRemoteDataSource.getTvShows()
            val body = response.body()
            if (body != null){
                tvShowList = body.tvShows
            }
        }catch (exception: Exception){
            Log.i("MyTag", exception.message.toString())
        }
        return tvShowList
    }

    suspend fun getTvShowsFromDB(): List<TvShow>{
        lateinit var tvShowList: List<TvShow>
        try {
            tvShowList = tvShowLocalDataSource.getTvShowsFromDB()
        }catch (exception: Exception){
            Log.i("MyTag", exception.message.toString())
        }

        if(tvShowList.size > 0){
            return tvShowList
        }else{
            tvShowList = getTvShowsFromApi()
            tvShowLocalDataSource.saveTvShowsFromDB(tvShowList)
        }

        return tvShowList
    }

    suspend fun getTvShowsFromCache(): List<TvShow>{
        lateinit var tvShowList: List<TvShow>
        try {
           tvShowList = tvShowCacheDataSource.getTvShowsFromCache()
        }catch (exception: Exception){
            Log.i("MyTag", exception.message.toString())
        }

        if(tvShowList.size > 0){
            return tvShowList
        }else{
            tvShowList = getTvShowsFromDB()
            tvShowCacheDataSource.saveTvShowsToCache(tvShowList)
        }
        return tvShowList
    }
}
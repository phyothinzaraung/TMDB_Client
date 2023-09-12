package com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource

import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShow
import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TvShowList>
}
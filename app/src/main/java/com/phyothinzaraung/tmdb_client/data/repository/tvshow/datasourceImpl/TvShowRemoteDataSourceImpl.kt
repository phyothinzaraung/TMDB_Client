package com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasourceImpl

import com.phyothinzaraung.tmdb_client.data.api.TMDBService
import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShow
import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShowList
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.phyothinzaraung.tmdb_client.domain.repository.TvShowRepository
import retrofit2.Response

class TvShowRemoteDataSourceImpl(private val tmdbService: TMDBService,
private val apiKey: String): TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTVShows(apiKey)
}
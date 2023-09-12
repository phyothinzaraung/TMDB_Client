package com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource

import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(tvShows: List<TvShow>)
}
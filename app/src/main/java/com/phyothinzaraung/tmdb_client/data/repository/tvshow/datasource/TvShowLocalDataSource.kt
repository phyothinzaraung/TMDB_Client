package com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource

import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB(): List<TvShow>
    suspend fun saveTvShowsFromDB(tvShows: List<TvShow>)
    suspend fun clearAll()
}
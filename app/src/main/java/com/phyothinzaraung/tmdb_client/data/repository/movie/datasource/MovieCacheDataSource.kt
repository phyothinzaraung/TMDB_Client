package com.phyothinzaraung.tmdb_client.data.repository.movie.datasource

import com.phyothinzaraung.tmdb_client.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}
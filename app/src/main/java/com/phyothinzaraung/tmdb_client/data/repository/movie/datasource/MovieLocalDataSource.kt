package com.phyothinzaraung.tmdb_client.data.repository.movie.datasource

import com.phyothinzaraung.tmdb_client.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}
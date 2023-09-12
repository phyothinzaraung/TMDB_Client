package com.phyothinzaraung.tmdb_client.domain.repository

import com.phyothinzaraung.tmdb_client.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies():List<Movie>?
}
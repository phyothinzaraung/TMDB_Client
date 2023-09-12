package com.phyothinzaraung.tmdb_client.data.repository.movie.datasource

import com.phyothinzaraung.tmdb_client.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}
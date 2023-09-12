package com.phyothinzaraung.tmdb_client.data.repository.movie.datasourceImpl

import com.phyothinzaraung.tmdb_client.data.api.TMDBService
import com.phyothinzaraung.tmdb_client.data.model.movie.MovieList
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService,
private val apiKey: String): MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}
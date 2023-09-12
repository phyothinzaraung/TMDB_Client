package com.phyothinzaraung.tmdb_client.domain.usecase

import com.phyothinzaraung.tmdb_client.data.model.movie.Movie
import com.phyothinzaraung.tmdb_client.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}
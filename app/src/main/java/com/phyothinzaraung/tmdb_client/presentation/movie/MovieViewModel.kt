package com.phyothinzaraung.tmdb_client.presentation.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.phyothinzaraung.tmdb_client.data.model.movie.Movie
import com.phyothinzaraung.tmdb_client.domain.usecase.GetMoviesUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
): ViewModel() {

    fun getMovies() : LiveData<List<Movie>?> = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }

}
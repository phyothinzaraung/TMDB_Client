package com.phyothinzaraung.tmdb_client.presentation.di.movie

import com.phyothinzaraung.tmdb_client.domain.usecase.GetArtistUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.GetMoviesUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateArtistUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateMoviesUseCase
import com.phyothinzaraung.tmdb_client.presentation.artist.ArtistViewModelFactory
import com.phyothinzaraung.tmdb_client.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}
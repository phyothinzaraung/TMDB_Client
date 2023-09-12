package com.phyothinzaraung.tmdb_client.presentation.di.core

import com.phyothinzaraung.tmdb_client.domain.repository.ArtistRepository
import com.phyothinzaraung.tmdb_client.domain.repository.MovieRepository
import com.phyothinzaraung.tmdb_client.domain.repository.TvShowRepository
import com.phyothinzaraung.tmdb_client.domain.usecase.GetArtistUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.GetMoviesUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.GetTvShowsUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateArtistUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateMoviesUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateTvShowsUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase{
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUseCase{
        return GetTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowsUseCase{
        return UpdateTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository): GetArtistUseCase{
        return GetArtistUseCase(artistRepository)
    }

    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistUseCase{
        return UpdateArtistUseCase(artistRepository)
    }
}
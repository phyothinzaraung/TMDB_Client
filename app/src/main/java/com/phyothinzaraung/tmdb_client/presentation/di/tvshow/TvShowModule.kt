package com.phyothinzaraung.tmdb_client.presentation.di.tvshow

import com.phyothinzaraung.tmdb_client.domain.usecase.GetArtistUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.GetTvShowsUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateArtistUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateTvShowsUseCase
import com.phyothinzaraung.tmdb_client.presentation.artist.ArtistViewModelFactory
import com.phyothinzaraung.tmdb_client.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowsUseCase, updateTvShowsUseCase)
    }
}
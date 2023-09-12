package com.phyothinzaraung.tmdb_client.presentation.di.artist

import com.phyothinzaraung.tmdb_client.domain.usecase.GetArtistUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateArtistUseCase
import com.phyothinzaraung.tmdb_client.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistUseCase: GetArtistUseCase,
        updateArtistUseCase: UpdateArtistUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistUseCase, updateArtistUseCase)
    }
}
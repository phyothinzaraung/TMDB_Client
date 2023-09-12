package com.phyothinzaraung.tmdb_client.presentation.di.artist

import com.phyothinzaraung.tmdb_client.presentation.artist.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): ArtistSubComponent
    }
}
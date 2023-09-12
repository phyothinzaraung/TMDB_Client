package com.phyothinzaraung.tmdb_client.presentation.di.tvshow

import com.phyothinzaraung.tmdb_client.presentation.artist.ArtistActivity
import com.phyothinzaraung.tmdb_client.presentation.tv.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): TvShowSubComponent
    }
}
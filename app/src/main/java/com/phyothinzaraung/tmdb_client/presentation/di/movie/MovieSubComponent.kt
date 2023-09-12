package com.phyothinzaraung.tmdb_client.presentation.di.movie

import com.phyothinzaraung.tmdb_client.presentation.artist.ArtistActivity
import com.phyothinzaraung.tmdb_client.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): MovieSubComponent
    }
}
package com.phyothinzaraung.tmdb_client.presentation.di

import com.phyothinzaraung.tmdb_client.presentation.di.artist.ArtistSubComponent
import com.phyothinzaraung.tmdb_client.presentation.di.movie.MovieSubComponent
import com.phyothinzaraung.tmdb_client.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}
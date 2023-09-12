package com.phyothinzaraung.tmdb_client.presentation.di.core

import com.phyothinzaraung.tmdb_client.presentation.di.artist.ArtistSubComponent
import com.phyothinzaraung.tmdb_client.presentation.di.movie.MovieSubComponent
import com.phyothinzaraung.tmdb_client.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    NetModule::class,
    DatabaseModule::class,
    UseCaseModule::class,
    RepositoryModule::class,
    RemoteDataModule::class,
    LocalDataModule::class,
    CacheDataModule::class
])
interface AppComponent {

    fun movieSubComponent(): MovieSubComponent.Factory
    fun tvSubComponent(): TvShowSubComponent.Factory
    fun artistSubComponent(): ArtistSubComponent.Factory
}
package com.phyothinzaraung.tmdb_client.presentation

import android.app.Application
import com.phyothinzaraung.tmdb_client.BuildConfig
import com.phyothinzaraung.tmdb_client.presentation.di.Injector
import com.phyothinzaraung.tmdb_client.presentation.di.artist.ArtistSubComponent
import com.phyothinzaraung.tmdb_client.presentation.di.core.AppComponent
import com.phyothinzaraung.tmdb_client.presentation.di.core.AppModule
import com.phyothinzaraung.tmdb_client.presentation.di.core.DaggerAppComponent
import com.phyothinzaraung.tmdb_client.presentation.di.core.NetModule
import com.phyothinzaraung.tmdb_client.presentation.di.core.RemoteDataModule
import com.phyothinzaraung.tmdb_client.presentation.di.movie.MovieSubComponent
import com.phyothinzaraung.tmdb_client.presentation.di.tvshow.TvShowSubComponent

class App: Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }
}
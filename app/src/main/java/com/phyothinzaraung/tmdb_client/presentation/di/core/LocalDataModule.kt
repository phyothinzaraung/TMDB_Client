package com.phyothinzaraung.tmdb_client.presentation.di.core

import com.phyothinzaraung.tmdb_client.data.db.ArtistDao
import com.phyothinzaraung.tmdb_client.data.db.MovieDao
import com.phyothinzaraung.tmdb_client.data.db.TvShowDao
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasource.ArtistLocalDataSource
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasource.MovieLocalDataSource
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }
}
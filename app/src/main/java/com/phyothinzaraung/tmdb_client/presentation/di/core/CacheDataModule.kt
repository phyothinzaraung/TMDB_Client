package com.phyothinzaraung.tmdb_client.presentation.di.core

import com.phyothinzaraung.tmdb_client.data.repository.artist.datasource.ArtistCacheDataSource
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasource.MovieCacheDataSource
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowDataSource(): TvShowCacheDataSource{
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource{
        return ArtistCacheDataSourceImpl()
    }
}
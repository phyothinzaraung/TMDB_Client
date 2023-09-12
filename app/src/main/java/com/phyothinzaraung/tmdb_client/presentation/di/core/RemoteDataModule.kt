package com.phyothinzaraung.tmdb_client.presentation.di.core

import com.phyothinzaraung.tmdb_client.data.api.TMDBService
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasource.ArtistRemoteDataSource
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasource.MovieRemoteDataSource
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource{
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource{
        return TvShowRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource{
        return ArtistRemoteDataSourceImpl(tmdbService, apiKey)
    }

}
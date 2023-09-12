package com.phyothinzaraung.tmdb_client.presentation.di.core

import com.phyothinzaraung.tmdb_client.data.repository.artist.ArtistRepositoryImpl
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasource.ArtistCacheDataSource
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasource.ArtistLocalDataSource
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasource.ArtistRemoteDataSource
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.phyothinzaraung.tmdb_client.data.repository.movie.MovieRepositoryImpl
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasource.MovieCacheDataSource
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasource.MovieLocalDataSource
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasource.MovieRemoteDataSource
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.TvShowRepositoryImpl
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.phyothinzaraung.tmdb_client.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.phyothinzaraung.tmdb_client.domain.repository.ArtistRepository
import com.phyothinzaraung.tmdb_client.domain.repository.MovieRepository
import com.phyothinzaraung.tmdb_client.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource, movieCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(tvShowRemoteDataSource, tvShowLocalDataSource, tvShowCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(artistRemoteDataSource, artistLocalDataSource, artistCacheDataSource)
    }
}
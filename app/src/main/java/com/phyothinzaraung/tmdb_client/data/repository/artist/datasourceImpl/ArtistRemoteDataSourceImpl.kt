package com.phyothinzaraung.tmdb_client.data.repository.artist.datasourceImpl

import com.phyothinzaraung.tmdb_client.data.api.TMDBService
import com.phyothinzaraung.tmdb_client.data.model.artist.Artist
import com.phyothinzaraung.tmdb_client.data.model.artist.ArtistList
import com.phyothinzaraung.tmdb_client.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(private val tmdbService: TMDBService,
private val apiKey: String): ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> = tmdbService.getPopularArtist(apiKey)
}
package com.phyothinzaraung.tmdb_client.data.repository.artist.datasource

import com.phyothinzaraung.tmdb_client.data.model.artist.Artist
import com.phyothinzaraung.tmdb_client.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}
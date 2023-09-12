package com.phyothinzaraung.tmdb_client.domain.repository

import com.phyothinzaraung.tmdb_client.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}
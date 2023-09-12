package com.phyothinzaraung.tmdb_client.domain.usecase

import com.phyothinzaraung.tmdb_client.data.model.artist.Artist
import com.phyothinzaraung.tmdb_client.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.getArtists()
}
package com.phyothinzaraung.tmdb_client.domain.usecase

import com.phyothinzaraung.tmdb_client.data.model.artist.Artist
import com.phyothinzaraung.tmdb_client.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}
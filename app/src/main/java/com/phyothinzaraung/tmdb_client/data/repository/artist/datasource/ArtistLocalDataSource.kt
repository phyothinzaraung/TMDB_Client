package com.phyothinzaraung.tmdb_client.data.repository.artist.datasource

import com.phyothinzaraung.tmdb_client.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(artists:List<Artist>)
    suspend fun clearAll()
}
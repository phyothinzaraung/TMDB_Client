package com.phyothinzaraung.tmdb_client.data.repository.artist.datasource

import com.phyothinzaraung.tmdb_client.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)
}
package com.phyothinzaraung.tmdb_client.presentation.artist

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.phyothinzaraung.tmdb_client.domain.usecase.GetArtistUseCase
import com.phyothinzaraung.tmdb_client.domain.usecase.UpdateArtistUseCase

class ArtistViewModel(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
): ViewModel() {

    fun getArtists() = liveData {
        val artistList = getArtistUseCase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistUseCase.execute()
        emit(artistList)
    }
}
package com.phyothinzaraung.tmdb_client.domain.usecase

import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShow
import com.phyothinzaraung.tmdb_client.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}
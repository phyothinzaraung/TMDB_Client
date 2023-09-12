package com.phyothinzaraung.tmdb_client.data.model.tvshow


import com.google.gson.annotations.SerializedName
import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShow

data class TvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow>
)
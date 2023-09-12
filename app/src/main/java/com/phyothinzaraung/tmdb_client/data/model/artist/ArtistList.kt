package com.phyothinzaraung.tmdb_client.data.model.artist


import com.google.gson.annotations.SerializedName
import com.phyothinzaraung.tmdb_client.data.model.artist.Artist

data class ArtistList(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val artists: List<Artist>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)
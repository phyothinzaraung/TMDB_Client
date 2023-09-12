package com.phyothinzaraung.tmdb_client.data.model.movie


import com.google.gson.annotations.SerializedName
import com.phyothinzaraung.tmdb_client.data.model.movie.Movie

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>
)
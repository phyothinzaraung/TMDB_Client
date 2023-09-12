package com.phyothinzaraung.tmdb_client.data.api

import com.phyothinzaraung.tmdb_client.data.model.artist.ArtistList
import com.phyothinzaraung.tmdb_client.data.model.movie.MovieList
import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key")apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTVShows(@Query("api_key")apiKey: String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(@Query("api_key")apiKey: String): Response<ArtistList>
}
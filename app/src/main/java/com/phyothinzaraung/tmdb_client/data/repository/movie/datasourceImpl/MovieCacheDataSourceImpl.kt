package com.phyothinzaraung.tmdb_client.data.repository.movie.datasourceImpl

import com.phyothinzaraung.tmdb_client.data.model.movie.Movie
import com.phyothinzaraung.tmdb_client.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl: MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}
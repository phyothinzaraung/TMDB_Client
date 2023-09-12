package com.phyothinzaraung.tmdb_client.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.phyothinzaraung.tmdb_client.data.model.tvshow.TvShow

@Dao
interface TvShowDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShows(movies: List<TvShow>)

    @Query(value = "DELETE FROM popular_tvShows")
    suspend fun deleteAllTvShows()

    @Query(value = "SELECT * FROM popular_tvShows")
    suspend fun getTvShows() : List<TvShow>
}
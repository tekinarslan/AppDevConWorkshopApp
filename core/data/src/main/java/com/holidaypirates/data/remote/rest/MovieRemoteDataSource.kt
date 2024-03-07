package com.holidaypirates.data.remote.rest

import com.holidaypirates.model.Movies
import retrofit2.Response
import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor(private val movieService: MovieService) {

    suspend fun getPopularMovies(page: Int): Response<Movies> {
        return movieService.getPopular(page = page).asMovies()
    }

    suspend fun getNowPlaying(page: Int): Response<Movies> {
        return movieService.getNowPlaying(page = page).asMovies()
    }

    suspend fun getUpcoming(page: Int): Response<Movies> {
        return movieService.getUpcoming(page = page).asMovies()
    }
}
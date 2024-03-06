package com.holidaypirates.data.remote

import com.holidaypirates.model.Movies
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val nextflixService: NextflixService
) {

    suspend fun getPopularMovies(page: Int): Response<Movies> {
        return nextflixService.getPopular(page = page).asMovies()
    }

    suspend fun getNowPlaying(page: Int): Response<Movies> {
        return nextflixService.getNowPlaying(page = page).asMovies()
    }

    suspend fun getUpcoming(page: Int): Response<Movies> {
        return nextflixService.getUpcoming(page = page).asMovies()
    }

}
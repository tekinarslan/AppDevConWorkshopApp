package com.holidaypirates.domain.gateway

import com.holidaypirates.model.Movies
import retrofit2.Response


interface NextflixGateway {
    suspend fun getPopularMovies(page: Int): Response<Movies>
    suspend fun getNowPlayingMovies(page: Int): Response<Movies>
    suspend fun getUpcomingMovies(page: Int): Response<Movies>
}
package com.holidaypirates.data.remote.rest

import com.holidaypirates.model.Movies
import javax.inject.Inject
import retrofit2.Response

class MovieRepository @Inject constructor(
    private val movieRemoteDataSource: MovieRemoteDataSource
): MovieGateway {

    override suspend fun getPopularMovies(page: Int): Response<Movies> {
        return movieRemoteDataSource.getPopularMovies(page)
    }

    override suspend fun getNowPlayingMovies(page: Int): Response<Movies> {
        return movieRemoteDataSource.getNowPlaying(page)
    }

    override suspend fun getUpcomingMovies(page: Int): Response<Movies> {
        return movieRemoteDataSource.getUpcoming(page)
    }

}
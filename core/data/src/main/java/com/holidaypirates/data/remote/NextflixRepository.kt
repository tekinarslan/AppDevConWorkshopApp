package com.holidaypirates.data.remote

import com.holidaypirates.model.Movies
import javax.inject.Inject
import retrofit2.Response

class NextflixRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
): NextflixGateway {

    override suspend fun getPopularMovies(page: Int): Response<Movies> {
        return remoteDataSource.getPopularMovies(page)
    }

    override suspend fun getNowPlayingMovies(page: Int): Response<Movies> {
        return remoteDataSource.getNowPlaying(page)
    }

    override suspend fun getUpcomingMovies(page: Int): Response<Movies> {
        return remoteDataSource.getUpcoming(page)
    }

}
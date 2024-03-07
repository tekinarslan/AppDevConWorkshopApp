package com.holidaypirates.domain.usecase

import com.holidaypirates.model.Movies
import com.holidaypirates.data.remote.rest.MovieGateway
import retrofit2.Response
import javax.inject.Inject

class PopularUseCase @Inject constructor(
    private val movieGateway: MovieGateway,
) {

    suspend operator fun invoke(page: Int): Response<Movies> {
        return movieGateway.getPopularMovies(page)
    }

}
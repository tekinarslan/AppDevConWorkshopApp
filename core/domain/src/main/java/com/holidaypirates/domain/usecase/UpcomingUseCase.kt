package com.holidaypirates.domain.usecase

import com.holidaypirates.model.Movies
import com.holidaypirates.data.remote.MovieGateway
import retrofit2.Response
import javax.inject.Inject

class UpcomingUseCase @Inject constructor(
    private val movieGateway: MovieGateway,
) {

    suspend operator fun invoke(page: Int): Response<Movies> {
        return movieGateway.getUpcomingMovies(page)
    }
}
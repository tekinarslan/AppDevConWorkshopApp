package com.holidaypirates.domain.usecase

import com.holidaypirates.model.Movies
import com.holidaypirates.data.remote.NextflixGateway
import retrofit2.Response
import javax.inject.Inject

class PopularUseCase @Inject constructor(
    private val nextflixGateway: NextflixGateway,
) {

    suspend operator fun invoke(page: Int): Response<Movies> {
        return nextflixGateway.getPopularMovies(page)
    }

}
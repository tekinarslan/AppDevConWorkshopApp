package com.holidaypirates.domain.usecase

import com.holidaypirates.data.remote.graphql.RickyMortyGateway
import com.holidaypirates.model.Movies
import com.holidaypirates.data.remote.rest.MovieGateway
import retrofit2.Response
import javax.inject.Inject

class NowPlayingUseCase  @Inject constructor(private val movieGateway: MovieGateway,
    private val rickyMortyGateway: RickyMortyGateway) {

    suspend operator fun invoke(page: Int): Response<Movies> {
        rickyMortyGateway.home()
        return movieGateway.getNowPlayingMovies(page)
    }
}
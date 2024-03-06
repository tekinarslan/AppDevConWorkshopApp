package com.holidaypirates.data.remote

import com.holidaypirates.model.Movie
import com.holidaypirates.model.MoviesResponse
import com.holidaypirates.model.Movies
import com.holidaypirates.model.NetworkMovie
import retrofit2.Response

fun Response<MoviesResponse>.asMovies(): Response<Movies> = Response.success(body()?.let {
    Movies(
        results = it.results.map { movies -> movies.asMovie() },
        currentPage = 1,
        totalPages = it.totalPages,
    )
})

fun Movie.asMovie() = NetworkMovie(
    id = id,
    title = title,
    overview = overview,
    posterPath = posterPath,
    voteAverage = voteAverage,
)
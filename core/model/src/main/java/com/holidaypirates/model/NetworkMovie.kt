package com.holidaypirates.model

import com.holidaypirates.domain.util.Constants

data class NetworkMovie(
    val id: Int,
    val title: String,
    val overview: String,
    val posterPath: String,
    val voteAverage: Double?,
) {
    val posterUrl = Constants.POSTER_URL + posterPath

    val rating = voteAverage?.toString() ?: "0.0"
}
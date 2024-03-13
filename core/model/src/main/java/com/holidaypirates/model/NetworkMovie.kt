package com.holidaypirates.model

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
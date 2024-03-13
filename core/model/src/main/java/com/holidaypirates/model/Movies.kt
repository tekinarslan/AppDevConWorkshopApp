package com.holidaypirates.model


data class Movies(
    val results: List<NetworkMovie>,
    val currentPage: Int,
    val totalPages: Int,
)
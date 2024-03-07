package com.holidaypirates.data.remote.graphql


interface RickyMortyGateway {
    suspend fun home(): List<Any>
}
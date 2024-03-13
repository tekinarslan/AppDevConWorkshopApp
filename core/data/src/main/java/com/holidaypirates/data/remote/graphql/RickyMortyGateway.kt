package com.holidaypirates.data.remote.graphql

import com.holidaypirates.data.GetCharactersQuery


interface RickyMortyGateway {
    suspend fun characters(page: Int): GetCharactersQuery.Characters
}
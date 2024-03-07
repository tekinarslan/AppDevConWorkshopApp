package com.holidaypirates.data.remote.graphql

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RickyAndMortyRepository @Inject constructor(
    private val rickyAndMortyRemoteDataSource: RickyAndMortyRemoteDataSource
): RickyMortyGateway {

    override suspend fun home(): List<Any> {
        return rickyAndMortyRemoteDataSource.home()
    }
}
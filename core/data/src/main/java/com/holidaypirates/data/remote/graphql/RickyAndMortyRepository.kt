package com.holidaypirates.data.remote.graphql

import com.apollographql.apollo3.ApolloClient
import com.holidaypirates.data.GetCharactersQuery
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RickyAndMortyRepository @Inject constructor(private val apolloClient: ApolloClient) :
    RickyMortyGateway {

    override suspend fun characters(page: Int): GetCharactersQuery.Characters {
        val response = apolloClient.query(GetCharactersQuery(page)).execute()
        return response.dataAssertNoErrors.characters!!
    }
}
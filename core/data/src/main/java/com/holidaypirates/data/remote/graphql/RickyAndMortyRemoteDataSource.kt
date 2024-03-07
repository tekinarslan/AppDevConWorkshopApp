package com.holidaypirates.data.remote.graphql

import com.apollographql.apollo3.ApolloClient
import com.holidaypirates.data.CharactersQuery
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RickyAndMortyRemoteDataSource @Inject constructor(
    private val apolloClient: ApolloClient
) : RickyMortyGateway {

    override suspend fun home(): List<Any> {
        return try {
            val response = fetchHome()
            println("GraphQl.Ricky.Response=${response.data}")
            return arrayListOf()
        } catch (e: Exception) {
            e.printStackTrace()
            return arrayListOf()
        }
    }

    private suspend fun fetchHome() = withContext(Dispatchers.IO) {
        val query = CharactersQuery()
        return@withContext apolloClient.query(query).execute()
    }
}
package com.holidaypirates.domain.usecase

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.holidaypirates.data.remote.graphql.RickyAndMortyDataSource
import com.holidaypirates.data.remote.graphql.RickyAndMortyRepository
import com.holidaypirates.model.ItemCharacter
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RickyAndMortyUseCase @Inject constructor(private val rickyAndMortyRepository: RickyAndMortyRepository) {

    fun characters(): Flow<PagingData<ItemCharacter>> {
        val config = PagingConfig(
            pageSize = 20,
            enablePlaceholders = true,
            prefetchDistance = 5
        )
        return Pager(config) {
            RickyAndMortyDataSource(rickyAndMortyRepository = rickyAndMortyRepository)
        }.flow
    }
}
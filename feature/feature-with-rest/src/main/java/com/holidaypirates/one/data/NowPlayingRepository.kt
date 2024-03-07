package com.holidaypirates.one.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.holidaypirates.domain.usecase.NowPlayingUseCase
import com.holidaypirates.model.NetworkMovie
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NowPlayingRepository @Inject constructor(
    private val nowPlayingUseCase: NowPlayingUseCase
) {

    fun nowPlaying(): Flow<PagingData<NetworkMovie>> {
        val config = PagingConfig(
            pageSize = 20,
            enablePlaceholders = true,
            prefetchDistance = 5
        )
        return Pager(config) {
            NowPlayingDataSource(
                nowPlayingUseCase = nowPlayingUseCase
            )
        }.flow
    }
}

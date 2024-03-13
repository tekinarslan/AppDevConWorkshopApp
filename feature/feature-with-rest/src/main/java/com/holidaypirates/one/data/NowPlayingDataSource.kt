package com.holidaypirates.one.data

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.holidaypirates.domain.usecase.NowPlayingUseCase
import com.holidaypirates.model.NetworkMovie
import javax.inject.Inject

class NowPlayingDataSource @Inject constructor(private val nowPlayingUseCase: NowPlayingUseCase) :
    PagingSource<Int, NetworkMovie>() {

    override fun getRefreshKey(state: PagingState<Int, NetworkMovie>): Int? = state.anchorPosition

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, NetworkMovie> {
        return try {
            val nextPage = params.key ?: 1
            val movieResponse = nowPlayingUseCase(nextPage)

            if (movieResponse.body()?.results.isNullOrEmpty()) {
                LoadResult.Error(Exception("Something went wrong"))
            } else {
                val list = movieResponse.body()?.results ?: emptyList()

                LoadResult.Page(
                    data = list,
                    prevKey =
                    if (nextPage == 1) null
                    else nextPage - 1,
                    nextKey = nextPage.plus(1)
                )
            }
        } catch (t: Throwable) {
            LoadResult.Error(t)
        }
    }
}

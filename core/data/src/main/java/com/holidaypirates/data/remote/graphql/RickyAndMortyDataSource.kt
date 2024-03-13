package com.holidaypirates.data.remote.graphql

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.holidaypirates.data.fragment.CharacterDetail
import com.holidaypirates.model.ItemCharacter


class RickyAndMortyDataSource(private val rickyAndMortyRepository: RickyAndMortyRepository) :
    PagingSource<Int, ItemCharacter>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ItemCharacter> {
        val pageNumber = params.key ?: 0

        val charactersResponse = rickyAndMortyRepository.characters(pageNumber)
        charactersResponse.results?.let {
            val characters = charactersResponse.results.mapNotNull { it?.characterDetail?.mapToItem() }

            val prevKey = if (pageNumber > 0) pageNumber - 1 else null
            val nextKey = charactersResponse.info!!.next
            return LoadResult.Page(data = characters, prevKey = prevKey, nextKey = nextKey)
        }
        return LoadResult.Error(Exception("LoadResult.Error"))
    }

    override fun getRefreshKey(state: PagingState<Int, ItemCharacter>): Int? {
        return null
    }

    private fun CharacterDetail.mapToItem() =
        ItemCharacter(
            id = id.orEmpty(),
            name = name.orEmpty(),
            image = image.orEmpty()
        )
}

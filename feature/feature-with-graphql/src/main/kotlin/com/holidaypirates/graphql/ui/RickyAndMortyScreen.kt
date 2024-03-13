package com.holidaypirates.graphql.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.holidaypirates.model.ItemCharacter
import com.holidaypirates.ui.RickyItemView

@Composable
fun RickyAndMortyRoute(rickyAndMortyViewModel: RickyAndMortyViewModel = hiltViewModel()) {
    val characterList = rickyAndMortyViewModel.characterList.collectAsLazyPagingItems()
    RickyAndMortyScreen(characterList = characterList)
}

@Composable
fun RickyAndMortyScreen(characterList : LazyPagingItems<ItemCharacter>) {
    LazyColumn(modifier = Modifier.background(color = Color.DarkGray)) {
        items(characterList.itemCount) { index ->
            characterList[index]?.let { item ->
                RickyItemView(name = item.name, image = item.image)
            }
        }
    }
}

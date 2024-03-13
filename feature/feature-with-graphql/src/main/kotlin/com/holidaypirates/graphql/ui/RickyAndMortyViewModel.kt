package com.holidaypirates.graphql.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.holidaypirates.domain.usecase.RickyAndMortyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RickyAndMortyViewModel @Inject constructor(rickyAndMortyUseCase: RickyAndMortyUseCase) :
    ViewModel() {

    val characterList = rickyAndMortyUseCase.characters().cachedIn(viewModelScope)
}

package com.holidaypirates.one.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.holidaypirates.one.data.NowPlayingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NowPlayingViewModel @Inject constructor(
    nowPlayingRepository: NowPlayingRepository,
) : ViewModel() {

    val nowPlayingList = nowPlayingRepository.nowPlaying().cachedIn(viewModelScope)

}

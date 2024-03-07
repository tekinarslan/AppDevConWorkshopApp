package com.holidaypirates.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class FilterCharacter(
    private val page: Int = 0,
    val count: Int = 50
) : Parcelable
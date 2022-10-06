package com.example.beachapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cards(
    val id: Int,
    @StringRes val title: Int,
    @DrawableRes val imageRes : Int
)

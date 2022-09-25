package com.example.beachapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Beach(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)
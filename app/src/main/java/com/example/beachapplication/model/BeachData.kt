package com.example.beachapplication.model


import com.example.beachapplication.R


    val beachData = listOf(
        R.drawable.carbay to R.string.carbay,
        R.drawable.barbados_rockley_beach to R.string.rockley,
        R.drawable.pebbles to R.string.pebbles,
        R.drawable.needhams_point_beach to R.string.needhams_point
    ).map { Beach(it.first, it.second) }


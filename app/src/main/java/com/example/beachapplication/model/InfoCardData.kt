package com.example.beachapplication.model

import com.example.beachapplication.R
import java.lang.ProcessBuilder.Redirect.to


val infoCardData = listOf(
    R.drawable.hazards to R.string.rip_currents,
    R.drawable.hazards to R.string.hazard_title,
    R.drawable.hazards to R.string.hazard_title,
    R.drawable.hazards to R.string.hazard_title,

  ).map { Beach(it.first, it.second) }
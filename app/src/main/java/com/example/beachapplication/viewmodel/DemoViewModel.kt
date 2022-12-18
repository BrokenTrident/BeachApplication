package com.example.beachapplication.viewmodel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel



class DemoViewModel: ViewModel(){

    var index by mutableStateOf(0)


    fun getIndex (index: Unit){

    var result = index

        return result
    }



}
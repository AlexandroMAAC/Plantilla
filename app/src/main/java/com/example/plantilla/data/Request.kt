package com.example.plantilla.data

import android.util.Log
import  java.net.URL

class Request (private var url: String ){

    fun run  (){
        val forecastJson = URL(url).readText()
        Log.d("onpoint", forecastJson)

    }
}
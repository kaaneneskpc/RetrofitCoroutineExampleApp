package com.example.exampleapp

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        launch {
            delay(5000)
            println("Run Blocking")
        }
        coroutineScope {
            launch{
                delay(5000)
                println("Coroutine Scope")
            }
        }
    }


}
package com.example.exampleapp

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        delay(2000)
        println("Run Blocking")
        myFunc()
    }
}

suspend fun myFunc(){
    coroutineScope {
        delay(4000)
        println("Suspend Function")
    }
}
package com.example.exampleapp

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val myJob = launch {
            delay(2000)
            println("Job")
            val secondJob = launch {
                println("Job 2")
            }
        }

        myJob.invokeOnCompletion {
            println("My Job End..")
        }
        myJob.cancel()
    }
}
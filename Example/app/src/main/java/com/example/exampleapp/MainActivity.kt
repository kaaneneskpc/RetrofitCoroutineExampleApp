package com.example.exampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness

        //Scope - GlobalScope -RunBlocking - CoroutineScope

        //RunBlocking
        /*println("Run Blocking Start..")
        runBlocking {
            launch {
                delay(2000)
                println("Run Blocking..")
            }
        }
        println("Run Blocking End..")*/

        //GlobalScope

        /*println("Global Scope Start..")
        GlobalScope.launch {

                delay(2000)
                println("Global Scope..")
        }
        println("Global Scope End..")*/

        //Context

        /* println("Coroutine Scope Start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(2000)
            println("Coroutine Scope")
        }
        println("Coroutine Scope End")
       */

        //Dispatchers


       /*runBlocking {
            launch(Dispatchers.Main){
                println("Main Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO){
                println("IO Thread : ${Thread.currentThread().name} ")
            }
            launch(Dispatchers.Default){
                println("Default Thread : ${Thread.currentThread().name} ")
            }
            launch(Dispatchers.Unconfined){
                println("Unconfined Thread : ${Thread.currentThread().name} ")
            }
        }*/


    }
}
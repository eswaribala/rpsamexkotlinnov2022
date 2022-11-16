package com.amex.bankingapp.coroutines

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {


    launch{
        println("Blocking Thread ${Thread.currentThread().name}")
        fetchIndividuals()
    }

    insertIndividualData()
    println("${Thread.currentThread().name}")
}



suspend fun fetchIndividuals(){
    println("${Thread.currentThread().name}")
}


fun insertIndividualData(){
    println("${Thread.currentThread().name}")
}
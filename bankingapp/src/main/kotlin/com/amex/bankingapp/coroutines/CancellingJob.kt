package com.amex.bankingapp.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking{
       var job= launch{
            delay(3000)
           insertIndividualDatav1()
        }
    println("Executing main")
        fetchIndividualsv1()
    Thread.sleep(5000)
        job.cancel()
    job.join()
    }

}
package com.amex.bankingapp.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking{
       var job= launch{
            delay(12000)
           println("Executing the job")
        }
    println("Executing main")
    Thread.sleep(15000)
    job.cancel()
    job.join()
    }

}
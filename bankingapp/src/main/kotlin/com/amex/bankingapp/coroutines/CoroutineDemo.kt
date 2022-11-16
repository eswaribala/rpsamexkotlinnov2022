package com.amex.bankingapp.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun  main() {

    var name="Parameswari"
    var orgName="RPS Consulting"
    GlobalScope.launch {
        delay(2000)
        name.toCharArray().forEach {

                x-> println("Thread Name is ${Thread.currentThread().name}->$x\t")

        }

    }

    orgName.toCharArray().forEach {

            x-> println("Thread Name is ${Thread.currentThread().name}->$x\t")

    }
    Thread.sleep(3000)

}
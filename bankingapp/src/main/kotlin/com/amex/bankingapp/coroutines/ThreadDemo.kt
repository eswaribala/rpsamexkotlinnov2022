package com.amex.bankingapp.coroutines

import kotlin.concurrent.thread

fun main(){
    var name:String="Parameswari"
    var orgName="RPS Consulting"
    thread(start = true, name = "Animated Name"){
        name.toCharArray().forEach {
                x-> print("$x\t")
            Thread.sleep(2000)
        }

    }

    orgName.toCharArray().forEach {
            x-> print("$x\t")
        Thread.sleep(2000)
    }
}
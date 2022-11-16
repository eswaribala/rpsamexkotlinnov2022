package com.amex.bankingapp.coroutines

import com.amex.bankingapp.dao.IndividualImpl
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main(): Unit= coroutineScope {
//channel
    var channel = Channel<String>()

    var individualImpl=IndividualImpl()

    //producer
    launch {
        repeat(5) { index ->
            delay(1000)
            println("Producing next one")
           // individualImpl.getAllIndividuals().forEach{
             channel.send("data")
          //  }

        }
    }

    //consumer
    launch {
        repeat(5) {
            var name = channel.receive()
            println(name)
        }
    }

}
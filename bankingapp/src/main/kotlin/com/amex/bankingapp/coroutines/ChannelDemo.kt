package com.amex.bankingapp.coroutines

import com.amex.bankingapp.dao.IndividualImpl
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

suspend fun main(): Unit= coroutineScope {
//channel
    var channel = Channel<String>()
    var individualImpl=IndividualImpl()
    var count=individualImpl.getAllIndividuals().size

    launch {
        delay(1000)
        individualImpl.getAllIndividuals().forEach{
            it->
            channel.send(it.name)

        }



    }

    launch {
        for (x in 1..count)
            println(channel.receive())

    }

}
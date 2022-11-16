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
    var channel = Channel<Int>()

    launch {
        delay(1000)
        for (x in 1..5) channel.send(Random.nextInt(1000))

    }

    launch {
        for (x in 1..5)
            println(channel.receive())

    }

}
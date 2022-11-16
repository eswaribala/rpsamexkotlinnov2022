package com.amex.bankingapp.coroutines

import com.amex.bankingapp.dao.IndividualImpl
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

suspend fun main(): Unit= coroutineScope {
//channel
    var channel = Channel<Long>(capacity =2, BufferOverflow.DROP_OLDEST)
    var individualImpl=IndividualImpl()


    launch {

        individualImpl.getAllIndividuals().forEach{
            it->
            channel.send(it.accountNo)
            delay(1000)
        }
        channel.close()
    }

    launch {
        //channel iterator
        for (x in channel)

            println(channel.receive())

    }

}
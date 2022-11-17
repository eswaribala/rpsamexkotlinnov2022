package com.amex.bankingapp

import com.amex.bankingapp.dao.IndividualImpl
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun sendString(
    channel: SendChannel<String>,
    text: String,
    time: Long
) {
    while (true) {
        delay(time)
        channel.send(text)
    }
}

fun main() = runBlocking {
    val channel = Channel<String>()
    var individualImpl= IndividualImpl()

    var accountNo=individualImpl.getAllIndividuals().get(0).accountNo
   // println(accountNo)
    launch { sendString(channel, accountNo.toString(), 200L) }
    println(channel.receive())
    accountNo=individualImpl.getAllIndividuals().get(1).accountNo
   // println(accountNo)
    launch { sendString(channel, accountNo.toString(), 500L) }
      for(channelInstance in channel)
        println(channelInstance)

    coroutineContext.cancelChildren()
}
package com.amex.coroutines.senders

import com.amex.bankingapp.dao.IndividualImpl
import com.amex.coroutines.receivers.launchProcessor
import com.amex.coroutines.receivers.launchProcessor1
import com.amex.coroutines.receivers.launchProcessor2
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun CoroutineScope.produceNumbers() = produce {
    var individualImpl= IndividualImpl()
    individualImpl.getAllIndividuals().forEach{
            it->
        channel.send(it.accountNo)
        delay(1000)
    }
}

suspend fun main(): Unit = coroutineScope {
    val channel = produceNumbers()
   for(id in channel) {
       delay(10)
       launchProcessor(id, channel)
       launchProcessor1(id, channel)
       launchProcessor2(id, channel)
   }
}
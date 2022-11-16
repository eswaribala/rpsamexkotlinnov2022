package com.amex.coroutines.senders

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
    repeat(10) {
        delay(100)
        send(it)
    }
}

suspend fun main(): Unit = coroutineScope {
    val channel = produceNumbers()
    repeat(3) { id ->
        delay(10)
        launchProcessor(id, channel)
        launchProcessor1(id, channel)
        launchProcessor2(id, channel)
    }
}
package com.amex.coroutines.receivers

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun CoroutineScope.launchProcessor(
    id:Long,
    channel: ReceiveChannel<Long>
) = launch {
    for (msg in channel) {
        println("#$id received $msg")
    }
}
fun CoroutineScope.launchProcessor1(
    id: Long,
    channel: ReceiveChannel<Long>
) = launch {
    for (msg in channel) {
        println("#$id received $msg")
    }
}

fun CoroutineScope.launchProcessor2(
    id: Long,
    channel: ReceiveChannel<Long>
) = launch {
    for (msg in channel) {
        println("#$id received $msg")
    }
}

package com.amex.bankingapp.coroutines

import com.amex.bankingapp.models.Order
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope

// Order
fun CoroutineScope.orders(order:Order): ReceiveChannel<Order> =
    produce {


            send(order)

    }
//payment
fun CoroutineScope.payments(orderReceived: ReceiveChannel<Order>) =
    produce {

            send("Make payment for the Amount ${orderReceived.receive().amount}")

    }

suspend fun main() = coroutineScope {
    var orderInstance=Order(2399,4500)
    val orders = orders(orderInstance)
    val paymentData = payments(orders)
    for (data in paymentData) {
        println(data)
    }
}
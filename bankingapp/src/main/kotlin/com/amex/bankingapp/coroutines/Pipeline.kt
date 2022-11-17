package com.amex.bankingapp.coroutines

import com.amex.bankingapp.models.Delivery
import com.amex.bankingapp.models.Order
import com.amex.bankingapp.models.Stock
import com.amex.bankingapp.models.Payment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlin.random.Random

// Order
fun CoroutineScope.orders(order:Order): ReceiveChannel<Order> =
    produce {


            send(order)

    }
//payment
fun CoroutineScope.payments(orderReceived: ReceiveChannel<Order>) =
    produce {
            var order=orderReceived.receive()
            var payment= Payment(Random.nextLong(),order.amount,order.orderId.toLong())

            send(payment)

    }

fun CoroutineScope.stocks(paymentReceived: ReceiveChannel<Payment>) =
    produce {
        var payment=paymentReceived.receive()
        var stock=Stock(Random.nextLong(),payment.transactionId,payment.orderId)
        send(stock)

    }

fun CoroutineScope.delivery(stockReceived: ReceiveChannel<Stock>) =
    produce {

        var stock=stockReceived.receive()
        var delivery=Delivery(Random.nextLong(),stock.stockId,stock.orderId)
        send(delivery)

    }
suspend fun main() = coroutineScope {
    var orderInstance=Order(2399,4500)
    val orders = orders(orderInstance)
    val paymentData = payments(orders)
    val stockData=stocks(paymentData)
    val deliveryData=delivery(stockData)

    for (data in deliveryData) {
        println(data)
    }
}
package com.amex.bankingapp.utility

import com.amex.bankingapp.models.Order
import com.amex.bankingapp.models.times
import kotlin.random.Random

fun main(){

    var orderList= mutableListOf<Order>()
    for(value in 1..5){
        orderList.add(Order(Random.nextInt(10000),Random.nextInt(1000).toLong()+100))
    }

    var totalOrder:Order=Order(Random.nextInt(10000),Random.nextInt(1000).toLong()+100)
    for(order in orderList){
        totalOrder=totalOrder*order
    }

    println(totalOrder.amount)

}



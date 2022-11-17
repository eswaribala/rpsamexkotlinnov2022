package com.amex.bankingapp.models

data class Order(var orderId:Int,var amount:Long)

operator  fun Order.times(otherOrder:Order):Order{
    println("${this.amount},${otherOrder.amount}")
    var amount=this.amount*otherOrder.amount
    return Order(this.orderId,amount)
}
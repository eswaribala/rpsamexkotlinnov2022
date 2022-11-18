package com.amex.bankingapp.utility
class Producer<out T: Any>(val e:T) {
    fun read(): T = e
}

class Consumer<in T: Any>() {
    private lateinit var e: T
    fun write(v: T): Unit { e = v }
}

fun main() {
    var p1: Producer<Number> = Producer<Double>(0.4)
    p1.read()
  //  var p2: Producer<Double> = Producer<Number>(3)  // Disallowed
 //   p2.read()
  //  var c1: Consumer<Number> = Consumer<Double>()   // Disallowed
 //   c1.write(3)
    var c2: Consumer<Double> = Consumer<Number>()
    c2.write(0.4)
}
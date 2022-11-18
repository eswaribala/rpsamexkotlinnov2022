package com.amex.bankingapp.utility

class Cat
class Dog

fun addDog(list: MutableList<Any>) {
    list.add(Dog())
}

fun main() {
    val cats = mutableListOf(
        Cat(),
        Cat(),
        Cat()
    )
//check variance
   // addDog(cats) // technically ok because Cat extends Any, but MutableList is invariant on its type parameter

    cats.forEach {
        println(it)
    }

    /* if MutableList would not be invariant on its type parameter, you
     * would receive a ClassCastException at runtime
     * since Dog cannot be cast to Cat
     */
}
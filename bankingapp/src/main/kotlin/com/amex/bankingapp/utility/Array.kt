package com.amex.bankingapp.utility

import java.util.Random

fun main(){
    //var customerIds= arrayOf(49394,3496594,347534750);
   // customerIds= arrayOf()
    val customerIds = arrayOfNulls<Number>(5)

    for (id in customerIds.indices) {
        customerIds[id] = Random().nextInt(1000)
    }
/*
    for( id in customerIds){
        println(id)
    }

 */
    customerIds.forEach { id -> println(id) }
}
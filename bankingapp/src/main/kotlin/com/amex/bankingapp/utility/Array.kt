package com.amex.bankingapp.utility

import kotlin.random.Random


fun main(){
    //var customerIds= arrayOf(49394,3496594,347534750);
   // customerIds= arrayOf()
    val customerIds = arrayOfNulls<Number>(5)

    for (id in customerIds.indices) {
        //Object creation does not use new keyword
        customerIds[id] = Random.nextInt(1000)
    }

    //range

    for ( value in 1..35){
        print("${Random.nextInt(100000)}\t")
    }

/*
    for( id in customerIds){
        println(id)
    }

 */
    customerIds.forEach { id -> println(id) }

    //while loop
    var index=0;
    while(index < customerIds.size){

        println("The value of ${customerIds[index]} customer Id in position $index")
        index++;
    }


}
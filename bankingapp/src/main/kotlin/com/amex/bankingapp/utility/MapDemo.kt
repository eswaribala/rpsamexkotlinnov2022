package com.amex.bankingapp.utility

import com.amex.bankingapp.models.Address
import com.amex.bankingapp.models.Gender
import com.amex.bankingapp.models.Individual
import java.time.LocalDate
import kotlin.random.Random

fun main(){

    var individualsMap= mutableMapOf<Int,Individual>()

    for(value in 1..25){
        individualsMap.put(Random.nextInt(1000),Individual(Random.nextInt(10000).toLong(),"Parameswari"+value, Address("","","",
            "",0),995203286+Random.nextInt(9).toLong(),"Parameswairbala@gmail.com","Test@123","Bala",
            Gender.FEMALE,             LocalDate.of(1970+Random.nextInt(19),
                Random.nextInt(10)+1,Random.nextInt(25)+1)))
    }

    individualsMap.filter{it.key>100}.forEach{(k,v)->println("$k, ${v.dob}")}

    //groupby
    //println("Number of groups ${individualsMap.values.groupBy { it->it.dob.year }.count()}")
    individualsMap.map { it->it.value.dob }.forEach{it->println("$it")}
    println("Number of groups  ${individualsMap.map { it->it.value.dob }.groupBy { it->it.year }.count()}")

}
package com.amex.bankingapp.utility

import com.amex.bankingapp.models.Address
import com.amex.bankingapp.models.Gender
import com.amex.bankingapp.models.Individual
import java.time.LocalDate
import kotlin.random.Random

fun main(){
var list= listOf<Double>(79.9,800.0)
list.forEach{x->println(x)}

var mutableList= mutableListOf<Int>()
//add 100 elements

for(value in 1..100){
    mutableList.add(Random.nextInt(1000))
}
mutableList.filter { it > 100 }.forEach { x->println(x) }


var individualList= mutableListOf<Individual>()

for(value in 1..10){
    individualList.add(Individual(Random.nextInt(10000).toLong(),"Parameswari"+value, Address("","","",
        "",0),995203286+Random.nextInt(9).toLong(),"Parameswairbala@gmail.com","Test@123","Bala",
        Gender.FEMALE, LocalDate.of(1970+Random.nextInt(19),Random.nextInt(10)+1,Random.nextInt(25)+1)))
}

individualList.sortedWith(Comparator<Individual>{
    i1,i2-> i1.dob.compareTo(i2.dob)

}).forEach{it->println("${it.name},${it.dob}")}
}
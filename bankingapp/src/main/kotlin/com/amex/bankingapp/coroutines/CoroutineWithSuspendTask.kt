package com.amex.bankingapp.coroutines

import com.amex.bankingapp.dao.IndividualImpl
import com.amex.bankingapp.models.Address
import com.amex.bankingapp.models.Gender
import com.amex.bankingapp.models.Individual
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDate

fun main(){
    GlobalScope.launch {
      println(Thread.currentThread().name)
        fetchIndividualsv1()
    }
    println(Thread.currentThread().name)
    Thread.sleep(5000)
    insertIndividualDatav1()
}


suspend fun fetchIndividualsv1() {
    println("${Thread.currentThread().name}")
    delay(100)
    var individualImpl = IndividualImpl()
    individualImpl.getAllIndividuals().forEach { x ->
        println("${x.accountNo},${x.name}")

    }
}


fun insertIndividualDatav1(){

    var individualImpl= IndividualImpl()
//main thread, if main delayed everything is under that will be delayed
    Thread.sleep(2000)


    individualImpl.addIndividual(
        Individual(1009,"Parameswari", Address("","","",
            "",0),9952032862,"Parameswairbala@gmail.com","Test@123","Bala",
            Gender.FEMALE, LocalDate.of(1970,12,2))
    )
    println("${Thread.currentThread().name}")
}
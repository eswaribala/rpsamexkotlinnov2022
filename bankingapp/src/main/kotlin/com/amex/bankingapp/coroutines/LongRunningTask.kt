package com.amex.bankingapp.coroutines

import com.amex.bankingapp.dao.IndividualImpl
import com.amex.bankingapp.models.Address
import com.amex.bankingapp.models.Gender
import com.amex.bankingapp.models.Individual
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDate

fun main()= runBlocking {


    launch{
        println("Blocking Thread ${Thread.currentThread().name}")
        fetchIndividuals()
    }

    insertIndividualData()
    println("${Thread.currentThread().name}")
}



suspend fun fetchIndividuals() {
    println("${Thread.currentThread().name}")

    var individualImpl = IndividualImpl()
    individualImpl.getAllIndividuals().forEach { x ->
        println("${x.accountNo},${x.name}")

    }
}


fun insertIndividualData(){

    var individualImpl= IndividualImpl()

    individualImpl.addIndividual(
        Individual(38888,"Parameswari", Address("","","",
            "",0),9952032862,"Parameswairbala@gmail.com","Test@123","Bala",
            Gender.FEMALE, LocalDate.of(1970,12,2))
    )
    println("${Thread.currentThread().name}")
}
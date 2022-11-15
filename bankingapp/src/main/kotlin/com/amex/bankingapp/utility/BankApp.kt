package com.amex.bankingapp.utility

import com.amex.bankingapp.models.*
import java.time.LocalDate

fun main(){

    var customer1= Customer(5936996,"Parameswari", Address("13b",
        "Gandhi Road","Bangalore","KN"),
        28582548,"Param","Test@123")

    var customer2 = Customer(5936997,"Parameswari", Address("5A",
        "Rajai St","Chennai","TN"),
        28582549,"Param","Test@123")
    var customer3=Customer()
    var customer4=Customer()
    println("${customer1.accountNumber},${customer1.name},${customer1.address.city}")
    println("${customer2.email},${customer2.password},${customer2.address.city}")
    println("${customer3.accountNumber},${customer3.name}")
    //static variable
    println("Total Number of Customers = ${Customer.totalNumberOfCustomers()}");

    var individual= Individual("Bala",Gender.MALE, LocalDate.of(1995,12,7))
    println("${individual.accountNumber},${individual.name},${individual.gender}," +
            "${individual.dob},${individual.address.city}")



}
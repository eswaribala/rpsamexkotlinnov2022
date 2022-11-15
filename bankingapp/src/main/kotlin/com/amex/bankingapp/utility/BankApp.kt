package com.amex.bankingapp.utility

import com.amex.bankingapp.models.Address
import com.amex.bankingapp.models.Customer

fun main(){
    var customer1= Customer(5936996,"Parameswari", Address(),
        28582548,"Param","Test@123")
    var customer2 = Customer(5936997,"Parameswari", Address(),
        28582549,"Param","Test@123")
    println("${customer1.accountNumber},${customer1.name}")
    println("${customer2.email},${customer2.password}")
}
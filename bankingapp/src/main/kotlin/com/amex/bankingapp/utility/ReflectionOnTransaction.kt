package com.amex.bankingapp.utility

import com.amex.bankingapp.models.Transaction
import kotlin.reflect.full.memberFunctions

fun main(){
    var transactionRef=Transaction::class

    //list all the methods in the class

    transactionRef.memberFunctions.forEach{
        it->println(it)
    }

}
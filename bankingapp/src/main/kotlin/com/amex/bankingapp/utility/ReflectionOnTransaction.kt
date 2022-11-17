package com.amex.bankingapp.utility

import com.amex.bankingapp.models.SpaceCraft
import com.amex.bankingapp.models.Transaction
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

fun main(){
    var transactionRef=Transaction::class

    //list all the methods in the class

    transactionRef.memberFunctions.forEach{
        it->println(it)
    }
    //list of all attributes in the class
    transactionRef.memberProperties.forEach{
        it->println(it)
    }

    var spaceCraftRef= SpaceCraft::class
    //list of all constructors in the class
    spaceCraftRef.constructors.forEach{
        it->println(it)
    }

}
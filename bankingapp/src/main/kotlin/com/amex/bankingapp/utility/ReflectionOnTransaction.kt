package com.amex.bankingapp.utility

import com.amex.bankingapp.models.DirectDebit
import com.amex.bankingapp.models.SpaceCraft
import com.amex.bankingapp.models.Transaction
import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.random.Random
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

fun main(){
    var transactionRef=Transaction::class

    var transaction=DirectDebit("HSBC", LocalDate.now(),Random.nextInt(10000).toLong(),LocalDateTime.now(),"","")
    //list all the methods in the class

    transactionRef.memberFunctions.forEach{
        it->println(it)
    }
    //list of all attributes in the class
    transactionRef.memberProperties.forEach{
        it->println(it)
    }

    val amountRef = transactionRef.memberProperties.find {
        it.name == "amount"
    }

    println("Getter access ${amountRef?.getter?.call(transaction)}") //

    var variableToInvoke  = transactionRef.memberProperties.find { it.name == "sender" }
    // using getter
    println("Invokable ${variableToInvoke?.get(transaction)}")




    var spaceCraftRef= SpaceCraft::class
    //list of all constructors in the class
    spaceCraftRef.constructors.forEach{
        it->println(it)
    }

//mutability
    if (variableToInvoke is KMutableProperty<*>) {
        variableToInvoke.setter.call(transaction, "Parameswari")
    }
    // retrive the value after change
    println(variableToInvoke?.get(transaction))

}
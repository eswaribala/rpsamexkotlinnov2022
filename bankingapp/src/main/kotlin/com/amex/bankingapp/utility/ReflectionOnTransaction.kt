package com.amex.bankingapp.utility

import com.amex.bankingapp.helpers.DBHelper
import com.amex.bankingapp.models.Customer
import com.amex.bankingapp.models.DirectDebit
import com.amex.bankingapp.models.SpaceCraft
import com.amex.bankingapp.models.Transaction
import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.random.Random
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.companionObject
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

fun main(){
    var transactionRef=Transaction::class

    var transaction=DirectDebit("HSBC", LocalDate.now(),Random.nextInt(10000).toLong(),
        LocalDateTime.now(),"","")
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

//static method or field

    var customerRef = Customer::class

    //to create

    var customerObj=customerRef.createInstance()

    println("Static Method Access ${customerRef.companionObject}")

    customerRef.companionObject?.memberProperties?.forEach{
        it->println(it)
    }

    customerRef.companionObject?.memberFunctions?.forEach{
            it->println(it)
    }

    //singleton
    var dbHelperRef=DBHelper::class
    //test it is an object or not, if object access the value, possible only with singleton
    println(dbHelperRef.objectInstance?.driver)

    dbHelperRef.memberProperties.forEach{
        it->println(it)
    }




}
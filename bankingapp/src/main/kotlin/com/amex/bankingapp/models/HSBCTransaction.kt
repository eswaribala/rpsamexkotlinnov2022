package com.amex.bankingapp.models
//functional interface

fun interface HSBCTransaction {
    //default implementation
    fun depositMoney()=0
    //default implementation
    fun withdrawMoney()=0
    fun getOTP():Int
}
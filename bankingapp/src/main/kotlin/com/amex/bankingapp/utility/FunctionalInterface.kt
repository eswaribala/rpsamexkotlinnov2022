package com.amex.bankingapp.utility

import com.amex.bankingapp.models.HSBCTransaction
import kotlin.random.Random

fun main(){

    //implement Functional Interface
//anonymous object
    var otp=HSBCTransaction{Random.nextInt()}

    println(otp.getOTP())
}
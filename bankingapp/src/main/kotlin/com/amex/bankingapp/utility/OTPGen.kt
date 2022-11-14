package com.amex.bankingapp.utility

import kotlin.random.Random
//type is inferred
fun otpgen(name:String, id:Int)=name+id+ Random.nextInt(1000)

fun main(){
   var result = otpgen("Parameswari",6725467)
   println(result)
   println(result::class.java.typeName)
}
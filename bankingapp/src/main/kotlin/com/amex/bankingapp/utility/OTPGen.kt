package com.amex.bankingapp.utility

import kotlin.random.Random
//type is inferred
//parameter
//conditional statement

fun parseString(id:String):Int?=id.toIntOrNull()

fun otpgen(name:String, id:Int)= if (id>10000) name.substring(2,4)+id+ Random.nextInt(1000)
           else name.substring(6,8)+id+ Random.nextInt(5000)


fun otpGenWithString(name:String,id:String): String{

   var result=parseString(id)
  if (result!=null)
     return otpgen(name,result)
   else
      return "Not Possible to Parse"

}

fun main(){
   var result = otpgen("Parameswari",6725467)

   println(result)
   println(result::class.java.typeName)

   result = otpGenWithString("Parameswari","dvfwfh")
   println(result)

   var orgName="American Express"

   println("Coining the Organization Name,${orgName.substring(0,8)}")
}
package com.amex.bankingapp.utility
fun main() {
    println("Configuring Banking Business Case....")
    //explicit data type
    var customerId:Short
    val bankName="Amex"
    //bankName="HSBC"
    customerId=5796
    println("Customer Id=$customerId")
    //type check
    println(customerId::class.java.typeName)
    //charcter
    var accountType='S'
    println(accountType::class.java.typeName)
//type conversion
    var roiData=0.6F
    var rot:Int=roiData.toInt()



}
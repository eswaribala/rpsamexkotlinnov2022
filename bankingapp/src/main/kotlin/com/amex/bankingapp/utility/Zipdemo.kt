package com.amex.bankingapp.utility

fun main(){

    var companyList= listOf<String>("TCS","Infosys","Accenture","Amex","HCL")
    var shareIndexList= listOf<Int>(2500,2550,1800,2800)
    var sharemap= mutableMapOf<String,Int>()

    //tcs->2500, infosys->2550, accenture->1800, amex->2800
    companyList.zip(shareIndexList).forEach{(i1,i2)->sharemap.put(i1,i2)}
    companyList.zip(shareIndexList).forEach{(i1,i2)->println("$i1,$i2")}

    println(sharemap.values.forEach{it->println("$it")})

    //associatewith
    println(companyList.associateWith { it->it.length })

}
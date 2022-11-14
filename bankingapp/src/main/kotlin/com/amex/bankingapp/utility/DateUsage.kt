package com.amex.bankingapp.utility

import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId

fun validateDate(openingDate:LocalDate)=openingDate.isBefore(LocalDate.now())

//account opening date should not be your past date
fun main(){

    println("Enter Account Opening Date")
    val openingDate= LocalDate.parse(readLine())
    println(validateDate(openingDate))

    println("Enter Account Opening Date DD-MM-YYYY")
    val openingOldDate= readLine()
    //date
    val formatter=SimpleDateFormat("dd-MM-yyyy")
    val result = formatter.parse(openingOldDate)
    println(result)
    //convert date to LocalDate
    val localDate =result.toInstant().atZone(ZoneId.systemDefault())

    println(validateDate(localDate.toLocalDate()))



}
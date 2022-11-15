package com.amex.bankingapp.models

import java.time.LocalDate

abstract class Account {

   abstract var runningTotal:Long
   abstract var openingDate: LocalDate
  //abstract  fun showCustomerTransactions()
 open fun showCustomerTransactions(){
      println("Displaying customer transactions.....")
  }
}
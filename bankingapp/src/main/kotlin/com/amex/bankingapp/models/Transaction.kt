package com.amex.bankingapp.models

import java.time.LocalDateTime

interface Transaction {
  val bankName:String
  var amount: Long
  var timeStamp:LocalDateTime
  var sender: String
  var receiver:String
  //default implementation
  fun depositMoney()=0
  //default implementation
  fun withdrawMoney()=0
}
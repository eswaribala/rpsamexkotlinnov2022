package com.amex.bankingapp.extensions

import com.amex.bankingapp.dao.IndividualImpl
import com.amex.bankingapp.models.Individual

fun Individual.isAvailable():Boolean{
var individualImpl= IndividualImpl()
   return individualImpl.getIndividualById(485874)

}
package com.amex.bankingapp.utility

import com.amex.bankingapp.annotations.Validator
import com.amex.bankingapp.models.Member

fun main(){
    var member= Member(8465864,"Param")
    var validator=Validator()
    println(validator.isValid(member))
}
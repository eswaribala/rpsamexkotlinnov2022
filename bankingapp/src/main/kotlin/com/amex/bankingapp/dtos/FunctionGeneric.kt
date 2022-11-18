package com.amex.bankingapp.dtos



fun <T,R> holidayList(holidayList: Map<T,R>){

    holidayList.forEach{(k,v)->
        println("$k,$v")
    }
}
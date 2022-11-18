package com.amex.bankingapp.utility

import com.amex.bankingapp.dtos.holidayList
import com.amex.bankingapp.dtos.holidayListExtension
import kotlin.random.Random

fun main(){

    var holidayListData= mutableMapOf<Int,String>()

    for(i in 1..22){
        holidayListData.put(Random.nextInt(25), "H$i")
    }
    holidayList(holidayListData)

    var holidayInfo= mutableMapOf<String,String>()

    for(i in 1..100){
        holidayInfo.put("H"+Random.nextInt(25), "Govt Holiday")
    }

    holidayInfo.holidayListExtension()

}
package com.amex.bankingapp.dtos



fun <T,R> holidayList(holidayList: Map<T,R>){

    holidayList.forEach{(k,v)->
        println("$k,$v")
    }
}

//Extension Support
fun <T,R>Map<T,R>.holidayListExtension(){

   this.forEach{(k,v)->
        println("$k,$v")
    }
}
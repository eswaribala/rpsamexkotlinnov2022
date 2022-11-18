package com.amex.bankingapp.utility

import com.amex.bankingapp.dtos.DataWrapper
import com.amex.bankingapp.models.Member

fun main(){

    //Generic
//test as string
    var dataWrapper:DataWrapper<String>?=null
    dataWrapper= DataWrapper<String>("Testing...")
    println(dataWrapper.msg)


 //test as member

     var dataWrapperMember:DataWrapper<Member>?=null

    dataWrapperMember= DataWrapper<Member>(Member(1,"Param"))

    println(dataWrapperMember.pload)



}
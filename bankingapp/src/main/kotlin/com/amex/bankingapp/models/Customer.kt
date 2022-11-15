package com.amex.bankingapp.models

import java.math.BigInteger
import java.time.LocalDate

//Empty class
//class Customer
//primary constructor
//class Customer constructor(accountNumber:Long, name:String, address:Address, contactNumber:Long,
  //                         email:String, password:String)

//remove keyword constructor if not using annotations and visibility
//class Customer (accountNumber:Long, name:String, address:Address, contactNumber:Long,
//                                   email:String, password:String)
//add keyword constructor if using annotations and visibility

class Customer public constructor(_accountNumber:Long, _name:String, _address:Address, _contactNumber:Long,
                                   _email:String, _password:String){

//static variable and static method
    companion object{
        var counter=0;

        fun totalNumberOfCustomers()=counter
    }


   //back fields
    var accountNumber=_accountNumber
    var name = _name;
    var address=_address;
    var contactNumber=_contactNumber;
    var email=_email;
    var password=_password;
    var openingDate: LocalDate;
    init{
        println("initialize data")
        openingDate=LocalDate.now()
        counter++;
    }

//secondary constructor

    constructor() : this(5936996,"Vignesh", Address("34","Gandhi Road","Pune","MH"),
        28582548,"Param","Test@123")




}



//DTO

//data class Customer (var accountNumber:Long, var name:String, var address:Address, var contactNumber:Long,
                               //  var email:String, var password:String)
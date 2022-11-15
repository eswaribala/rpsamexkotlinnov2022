package com.amex.bankingapp.utility

import com.amex.bankingapp.models.Address
import com.amex.bankingapp.models.Customer

fun main(){
    var address=Address()
    address.doorNo="13b"
    address.streetName="Gandhi Road"
    address.city="Bangalore"
    address.state="Karanatka"
    
    var customer1= Customer(5936996,"Parameswari", address,
        28582548,"Param","Test@123")
    address=Address()
    address.doorNo="16b"
    address.streetName="Gandhi Road"
    address.city="Chennai"
    address.state="TN"
    var customer2 = Customer(5936997,"Parameswari", address,
        28582549,"Param","Test@123")
    var customer3=Customer()
    var customer4=Customer()
    println("${customer1.accountNumber},${customer1.name}")
    println("${customer2.email},${customer2.password}")
    println("${customer3.accountNumber},${customer3.name}")
    //static variable
    println("Total Number of Customers = ${Customer.totalNumberOfCustomers()}");
}
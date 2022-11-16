package com.amex.bankingapp.utility

import com.amex.bankingapp.dao.IndividualImpl
import com.amex.bankingapp.exceptions.*
import com.amex.bankingapp.extensions.isAvailable
import com.amex.bankingapp.models.*
import java.time.LocalDate

fun main(){

    var individual=Individual(485874,"Parameswari",Address("","","",
        "",0),9952032862,"Parameswairbala@gmail.com","Test@123","Bala",
        Gender.FEMALE,LocalDate.of(1970,12,2))
    println(individual.isAvailable())
    var individualImpl=IndividualImpl()
    individualImpl.getAllIndividuals().forEach { x -> println("${x.accountNo},${x.name}") }
    /*
    try {
    var individualImpl=IndividualImpl()
    /*
    individualImpl.addIndividual(Individual(485874,"Parameswari",Address("","","",
        "",0),9952032862,"Parameswairbala@gmail.com","Test@123","Bala",
        Gender.FEMALE,LocalDate.of(1970,12,2)))
*/

        individualImpl.getAllIndividuals().forEach { x -> println("${x.accountNo},${x.name}") }
    }

    catch(url: UrlNotFound){

    }
    catch(resource: ResourceNotFound){

    }
    catch(userName: UserNameNotFound){

    }
    catch(password: PasswordNotFound){

    }
    catch(connection: ConnectionNotFound){

    }
    catch(initial:ExceptionInInitializerError){

    }

     */
}

/*
    var customer1= Customer(5936996,"Parameswari", Address("13b",
        "Gandhi Road","Bangalore","KN",800001),
        28582548,"Param","Test@123")

    var customer2 = Customer(5936997,"Parameswari", Address("5A",
        "Rajai St","Chennai","TN",600001),
        28582549,"Param","Test@123")
    var customer3=Customer()
    var customer4=Customer()
    println("${customer1.accountNumber},${customer1.name},${customer1.address.city}")
    println("${customer2.email},${customer2.password},${customer2.address.city}")
    println("${customer3.accountNumber},${customer3.name}")
    //static variable
    println("Total Number of Customers = ${Customer.totalNumberOfCustomers()}");

    var individual= Individual("Bala",Gender.MALE, LocalDate.of(1995,12,7))
    println("${individual.accountNumber},${individual.name},${individual.gender}," +
            "${individual.dob},${individual.address.city}")


    var savingsAccount=SavingsAccount(500000,LocalDate.of(2007,1,1),
        0.8F)
    println(savingsAccount.runningTotal)
    savingsAccount.showCustomerTransactions()
*/
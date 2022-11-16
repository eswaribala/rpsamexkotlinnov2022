package com.amex.bankingapp.dao

import com.amex.bankingapp.dtos.ResponseWrapper
import com.amex.bankingapp.exceptions.ConnectionNotFound
import com.amex.bankingapp.facades.IndividualFacade
import com.amex.bankingapp.helpers.DBHelper
import com.amex.bankingapp.models.Gender
import com.amex.bankingapp.models.Individual
import java.sql.Connection
import java.sql.Date
import java.util.ResourceBundle

class IndividualImpl : IndividualFacade {
    var resourceBundle:ResourceBundle = ResourceBundle.getBundle("db")
    var conn:Connection?= DBHelper.getConnection()
     init{
         if(conn !=null)
             println("Connection Established")
         else
            throw ConnectionNotFound()
     }
    override fun addIndividual(individual: Individual): Int? {

        var customerQuery=resourceBundle.getString("customerInsertQuery")
        var individualQuery=resourceBundle.getString("individualInsertQuery")
       var customerstmt = conn?.prepareStatement(customerQuery)
        customerstmt?.setLong(1,individual.accountNumber)
        customerstmt?.setLong(2,individual.contactNumber)
        customerstmt?.setString(3,individual.name)
        customerstmt?.setString(4,individual.email)
        customerstmt?.setString(5,individual.password)
        var count=customerstmt?.executeUpdate()
        customerstmt = conn?.prepareStatement(individualQuery)
        customerstmt?.setString(1,individual.surName)
        customerstmt?.setString(2, individual.gender.toString())
        customerstmt?.setDate(3, Date.valueOf(individual.dob))
        customerstmt?.setLong(4,individual.accountNumber)

        count=customerstmt?.executeUpdate()

        return count
    }

    override fun getAllIndividuals(): List<ResponseWrapper> {
        var customerQuery=resourceBundle.getString("getIndividuals")
        var result=conn?.prepareStatement(customerQuery)?.executeQuery()
        var responseList= mutableListOf<ResponseWrapper>()
        if (result != null) {
            while (result.next()) {

                // getting the value of the id column
                val accountNo = result.getLong("Account_No")

                // getting the value of the name column
                val name = result.getString("Name")

                /*
            constructing a User object and
            putting data into the list
             */
                responseList.add(ResponseWrapper(accountNo, name))
            }
        }
        return responseList
    }

    override fun getIndividualById(accountNo: Long): Individual {
        TODO("Not yet implemented")
    }

    override fun updateIndividualById(accountNo: Long, individual: Individual): Individual {
        TODO("Not yet implemented")
    }

    override fun deleteIndividualById(accountNo: Long): Boolean {
        TODO("Not yet implemented")
    }
}
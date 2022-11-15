package com.amex.bankingapp.dao

import com.amex.bankingapp.facades.IndividualFacade
import com.amex.bankingapp.helpers.DBHelper
import com.amex.bankingapp.models.Individual
import java.sql.Connection
import java.util.ResourceBundle

class IndividualImpl : IndividualFacade {
    var resourceBundle:ResourceBundle = ResourceBundle.getBundle("db")
    var conn:Connection?= DBHelper.getConnection()
     init{
         if(conn !=null)
             println("Connection Established")
         else
             println("No Connection found")
     }
    override fun addIndividual(individual: Individual) {

    }

    override fun getAllIndividuals(): List<Individual> {
        TODO("Not yet implemented")
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
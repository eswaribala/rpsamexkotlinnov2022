package com.amex.bankingapp.dao

import com.amex.bankingapp.facades.IndividualFacade
import com.amex.bankingapp.models.Individual

class IndividualImpl : IndividualFacade {
    override fun addIndividual(individual: Individual) {
        TODO("Not yet implemented")
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
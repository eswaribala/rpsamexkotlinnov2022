package com.amex.bankingapp.facades

import com.amex.bankingapp.models.Individual

interface IndividualFacade {
   fun addIndividual(individual: Individual)
   fun getAllIndividuals():List<Individual>
   fun getIndividualById(accountNo: Long):Individual
    fun updateIndividualById(accountNo: Long,individual:Individual):Individual
    fun deleteIndividualById(accountNo: Long):Boolean
}
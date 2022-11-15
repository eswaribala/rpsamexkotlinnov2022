package com.amex.bankingapp.facades

import com.amex.bankingapp.models.Corporate

interface CorporateFacade {
    fun addCorporate(corporate: Corporate)
    fun getAllCorporates():List<Corporate>
    fun getCorporateById(accountNo: Long): Corporate
    fun updateCorporateById(accountNo: Long,corporate: Corporate): Corporate
    fun deleteCorporateById(accountNo: Long):Boolean
}
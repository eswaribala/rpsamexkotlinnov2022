package com.amex.bankingapp.dao

import com.amex.bankingapp.facades.CorporateFacade
import com.amex.bankingapp.models.Corporate

class CorporateImpl : CorporateFacade {
    override fun addCorporate(corporate: Corporate) {
        TODO("Not yet implemented")
    }

    override fun getAllCorporates(): List<Corporate> {
        TODO("Not yet implemented")
    }

    override fun getCorporateById(accountNo: Long): Corporate {
        TODO("Not yet implemented")
    }

    override fun updateCorporateById(accountNo: Long, corporate: Corporate): Corporate {
        TODO("Not yet implemented")
    }

    override fun deleteCorporateById(accountNo: Long): Boolean {
        TODO("Not yet implemented")
    }
}
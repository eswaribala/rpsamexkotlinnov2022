package com.amex.bankingapp.models

import java.time.LocalDate

class SavingsAccount(override var runningTotal: Long, override var openingDate: LocalDate) : Account() {
    override fun showCustomerTransactions() {

    }
}
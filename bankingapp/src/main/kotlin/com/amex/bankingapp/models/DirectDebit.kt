package com.amex.bankingapp.models

import java.time.LocalDate

class DirectDebit(override val bankName: String,paymentDate:LocalDate) : Transaction {
}
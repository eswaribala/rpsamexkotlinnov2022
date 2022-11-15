package com.amex.bankingapp.models

import java.time.LocalDate
import java.time.LocalDateTime

class DirectDebit(override val bankName: String, paymentDate:LocalDate,
                  override var amount: Long,
                  override var timeStamp: LocalDateTime,
                  override var sender: String,
                  override var receiver: String
) : Transaction {
    override fun depositMoney(): Int {
        return super.depositMoney()
    }
}
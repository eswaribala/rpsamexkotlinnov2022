package com.amex.bankingapp.models

import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.random.Random

class DirectDebit(override val bankName: String, paymentDate:LocalDate,
                  override var amount: Long,
                  override var timeStamp: LocalDateTime,
                  override var sender: String,
                  override var receiver: String
) : Transaction {

    override fun depositMoney(): Int {
        return Random.nextInt(10000)
    }

    override fun withdrawMoney(): Int {
        //conflict handling
        super<Transaction>.withdrawMoney()
        //super<HSBCTransaction>.withdrawMoney()=100
        return Random.nextInt()
    }


}
package com.amex.bankingapp.models

import java.time.LocalDateTime

class ExternalTransaction(override val bankName: String, var branchName:String,
                          var branchAddress:Address, branchCode:String,
                          override var amount: Long,
                          override var timeStamp: LocalDateTime,
                          override var sender: String,
                          override var receiver: String
) :Transaction {
}
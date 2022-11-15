package com.amex.bankingapp.models

class ExternalTransaction(override val bankName: String,branchName:String,
                          branchAddress:String, branchPostCode:Long, branchCode:String) :Transaction {
}
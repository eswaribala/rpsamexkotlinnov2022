package com.amex.bankingapp.utility

enum class AccountType{
    SAVINGS,CURRENT,DEMAT,LOAN
}

fun main(){
    val account=AccountType.DEMAT

    when(account){
        AccountType.CURRENT -> println("It is Corporate Account with OD")
        AccountType.DEMAT -> println("It is Investment Account")
        AccountType.SAVINGS -> println("It is individual Account with gender and dob")
        AccountType.LOAN -> println ("It is always associated to Insurance")
        else -> print("UnKnown Account")

    }
}
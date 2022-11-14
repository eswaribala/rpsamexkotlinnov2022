package com.amex.bankingapp.utility

enum class AccountType{
    SAVINGS,CURRENT,DEMAT,LOAN
}
//dynamic

fun main(){

    println("Enter Account Type")
    val account= readln()
    when(AccountType.valueOf(account.uppercase())){
        AccountType.CURRENT -> println("It is Corporate Account with OD")
        AccountType.DEMAT -> println("It is Investment Account")
        AccountType.SAVINGS -> println("It is individual Account with gender and dob")
        AccountType.LOAN -> println ("It is always associated to Insurance")
        else -> print("UnKnown Account")

    }



}
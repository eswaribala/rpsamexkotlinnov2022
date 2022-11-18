package com.amex.bankingapp.utility

class Company<T> (text : T){
    var x = text
    init{
        println(x)
    }
}

fun <T>printValue(list: ArrayList<T>){
    for(element in list){
        println(element)
    }
}

//Extension function
fun <T>ArrayList<T>.printValueExtension() {
    for (element in this) {
        println(element)
    }
}
    fun main(args: Array<String>){
    var name: Company<String> = Company<String>("RPS")
    var rank: Company<Int> = Company<Int>(12)

    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
    val s: String = stringList[0]
    println("printing the string value of stringList: $s")
    printValue(stringList)
    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
    printValue(floatList)

    //extension

        val stringListExt: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
        stringListExt.printValueExtension()
        val floatListExt: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
        floatListExt.printValueExtension()


    }
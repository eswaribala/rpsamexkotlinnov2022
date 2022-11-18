package com.amex.bankingapp.utility

data class Course(val name: String)

class OddList<T>(val list: List<T>) {
    fun oddItems(): List<T> {
        return list.filterIndexed { index, _ -> index % 2 == 1 }
    }
}

fun main() {
    val listOfStrings = listOf("Kotlin", "Java", "C#")
    val resultOfStrings: OddList<String> = OddList(listOfStrings)
    println(resultOfStrings.oddItems())

    val listOfInts = listOf(1, 7, 8, 9, 12, 45)
    val resultOfInts = OddList(listOfInts)
    println(resultOfInts.oddItems())

    val courses = listOf(
        Course("Kotlin"),
        Course("Java"),
        Course("C#"),
        Course("PHP"),
        Course("C++")
    )
    var resultCourses = OddList(courses).oddItems()
    println(resultCourses)
}
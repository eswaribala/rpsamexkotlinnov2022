package com.amex.bankingapp.utility
fun main() {
    val crewCrewCrew = listOf(
        Sloths("Jerry", false),
        Sloths("Bae", true),
        Sloths("Alex", false),
        Pandas("Tegan"),
        Pandas("Peggy")
    )
    /*
    interface Comparator<in T> {
    fun compare(e1: T, e2: T): Int {...}
     */

    val compareByNames = Comparator { a: Mammal, b: Mammal ->
        a.name.first().compareTo(b.name.first())
    }

    println(crewCrewCrew.sortedWith(compareByNames))
}
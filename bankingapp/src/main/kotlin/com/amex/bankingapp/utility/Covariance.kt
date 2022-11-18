package com.amex.bankingapp.utility

open class Mammal(val name: String) {
    fun eat() {}
    fun sleep() {}
}

data class Sloths(val slothName: String, val isTwoFingered: Boolean): Mammal(slothName)

data class Pandas(val pandaName: String) : Mammal(pandaName)

fun feedCrew(crew: List<Mammal>) { // List<out E> is covariant on its element type
    crew.forEach {
        it.eat()
    }
}

fun main() {
    val slothCrew = listOf(
        Sloths("Jerry", false),
        Sloths("Bae", true),
        Sloths("Chrissy", false),
    )

    val pandaCrew = listOf(
        Pandas("Jay"),
        Pandas("Peggy")
    )

    feedCrew(slothCrew)
    feedCrew(pandaCrew)
}
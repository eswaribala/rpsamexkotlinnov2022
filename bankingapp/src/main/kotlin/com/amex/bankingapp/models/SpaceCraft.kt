package com.amex.bankingapp.models

import com.amex.bankingapp.exceptions.BrokenEngineException

import com.amex.bankingapp.exceptions.OutOfFuelException
import com.amex.bankingapp.exceptions.SpaceToEarthConnectionFailedException

class SpaceCraft {
    var isConnectionAvailable: Boolean = false
    var isEngineInOrder: Boolean = false
    var isInSpace: Boolean = false
    var fuel: Int = 10 //actually 0

    constructor(isConnectionAvailable: Boolean, isEngineInOrder: Boolean, isInSpace: Boolean, fuel: Int) {
        this.isConnectionAvailable = isConnectionAvailable
        this.isEngineInOrder = isEngineInOrder
        this.isInSpace = isInSpace
        this.fuel = fuel
    }

    constructor(isConnectionAvailable: Boolean, isEngineInOrder: Boolean) {
        this.isConnectionAvailable = isConnectionAvailable
        this.isEngineInOrder = isEngineInOrder
    }

    constructor(isInSpace: Boolean, fuel: Int) {
        this.isInSpace = isInSpace
        this.fuel = fuel
    }


    fun launch() {
        if (fuel < 5) {
            throw OutOfFuelException()
        }
        if (!isEngineInOrder) {
            throw BrokenEngineException()
        }
        if (!isConnectionAvailable) {
            throw SpaceToEarthConnectionFailedException()
        }
        sendMessageToEarth("Trying to launch...")
        fuel -= 5
        sendMessageToEarth("I'm in space!")
        sendMessageToEarth("I've found some extraterrestrials")
        isInSpace = true
    }
    fun sendMessageToEarth(message: String) {
        println("Spacecraft to Earth: $message")
    }

    fun refuel() {
        fuel += 5
        sendMessageToEarth("The fuel tank is filled.")
    }
    fun repairEngine() {
        isEngineInOrder = true
        sendMessageToEarth("The engine is in order.")
    }
    fun fixConnection() {
        isConnectionAvailable = true
        sendMessageToEarth("Hello Earth! Can you hear me?")
        sendMessageToEarth("Connection is established.")
    }
    fun land() {
        sendMessageToEarth("Landing...")
        isInSpace = false
    }
}
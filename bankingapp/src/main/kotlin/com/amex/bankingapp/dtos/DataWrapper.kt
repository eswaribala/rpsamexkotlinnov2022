package com.amex.bankingapp.dtos

class DataWrapper<T> {
    private var message: String? = null
    private var payload: T? = null

    constructor(message: String?) : super() {
        this.message = message
    }

    constructor(payload: T) : super() {
        this.payload = payload
    }
}

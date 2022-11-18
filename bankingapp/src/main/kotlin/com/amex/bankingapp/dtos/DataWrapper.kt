package com.amex.bankingapp.dtos

class DataWrapper<T> {
    private var _message: String? = null
    private var _payload: T? = null

    constructor(message: String?) : super() {
        this._message = message
    }

    constructor(payload: T) : super() {
        this._payload = payload
    }

    //backfields
    var message=_message
    var payload=_payload
}

package com.amex.bankingapp.models

import java.time.LocalDate

final class Individual(_accountNumber:Long, _name:String, _address:Address, _contactNumber:Long,
                       _email:String, _password:String,_surName:String,_gender:Gender, _dob: LocalDate):Customer(_accountNumber
    , _name, _address, _contactNumber,
    _email, _password) {

    var surName=_surName
    var gender=_gender
    var dob=_dob
}
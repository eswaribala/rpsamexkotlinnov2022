package com.amex.bankingapp.models

import java.time.LocalDate

final class Individual(_surName:String,_gender:Gender, _dob: LocalDate):Customer() {

    var surName=_surName
    var gender=_gender
    var dob=_dob
}
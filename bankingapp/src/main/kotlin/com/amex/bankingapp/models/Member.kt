package com.amex.bankingapp.models

import com.amex.bankingapp.annotations.Alphabet
import com.amex.bankingapp.annotations.Positive

data class Member (@Positive var memberId:Long, @Alphabet var name:String)
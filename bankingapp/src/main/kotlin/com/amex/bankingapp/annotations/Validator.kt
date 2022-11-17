package com.amex.bankingapp.annotations

import com.amex.bankingapp.models.Member

class Validator {

    fun isValid(member: Member): Boolean {
        val fields = member::class.java.declaredFields
        for (field in fields) {
            field.isAccessible = true
            for (annotation in field.annotations) {
                val value = field.get(member)
                if (field.isAnnotationPresent(Positive::class.java)) {
                    val memberId = value as Long
                    if (memberId < 0) {
                        return false
                    }
                }
                if (field.isAnnotationPresent(Alphabet::class.java)) {

                    val value = field.get(member)

                        val name = value as String
                       if( !name.matches("^[a-zA-Z]*$".toRegex()))
                          return false
                }
            }
        }
        return true
    }
}
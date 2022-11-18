package com.example.api.controller.model

import com.amex.customerapp.models.FullName
import com.amex.customerapp.models.Gender
import com.amex.customerapp.models.Individual
import java.time.LocalDate

/**
 * Represents the DTO which is exposed to the clients through REST endpoints.
 */
data class IndividualDto(
    val accountNo: Long,
    val fullName: FullName,
    val contactNumber: Long,
    val email: String,
    val password: String,
    val gender: Gender,
    val dob:LocalDate
) {
    companion object ModelMapper {
        fun from(individual: Individual): IndividualDto {
            return IndividualDto(
                accountNo = individual.accountNumber,
                fullName = individual.fullName,
                contactNumber = individual.contactNumber,
                email = individual.email,
                password = individual.password,
                gender = individual.gender,
                dob = individual.dob
            )
        }
    }
}
package com.amex.customerapp.repositories

import com.amex.customerapp.models.Individual
import org.springframework.data.jpa.repository.JpaRepository

interface IndividualRepository:JpaRepository<Individual,Long> {
}
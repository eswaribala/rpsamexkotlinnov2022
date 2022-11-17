package com.amex.customerapp.repositories

import com.amex.customerapp.models.Corporate
import org.springframework.data.jpa.repository.JpaRepository

interface CorporateRepository:JpaRepository<Corporate,Long> {
}
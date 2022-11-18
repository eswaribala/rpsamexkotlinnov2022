package com.amex.bankinapp

import com.amex.bankingapp.models.Member
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class BankingTest {
    private val member: Member = Member(3142,"Param")

    @Order(2)
    @Test
    @DisplayName("Name Should be Equal to Expected")
    @RepeatedTest(3)
    fun testMember() {
        val expected = "Param"
        assertEquals(expected, member.name)


    }
    @Order(1)

    @ParameterizedTest(name = "isMember")
    @ValueSource(strings = ["Param", "Vignesh", "Bala", ""])
    @DisplayName("Name Length Should be > 0")
    fun `Function isMember returns true for Name`(name: String) {
        member.name=name
        assertTrue(member.name.length>0)
    }


   
}
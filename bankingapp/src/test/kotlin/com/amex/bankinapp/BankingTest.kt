package com.amex.bankinapp

import com.amex.bankingapp.models.Member
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

    @Test
    fun testMember() {
        val expected = "Param"
        assertEquals(expected, member.name)
    }
    @ParameterizedTest(name = "isMember")
    @ValueSource(strings = ["Param", "Vignesh", "Bala", ""])
    fun `Function isMember returns true for Name`(name: String) {
        member.name=name
        assertTrue(member.name.length>0)
    }


   
}
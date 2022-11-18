package com.amex.bankinapp

import com.amex.bankingapp.models.Member
import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.junit.jupiter.params.provider.ValueSource
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class BankingTest {
    private val member: Member = Member(3142,"Param")



    companion object{
         lateinit var resourceBundle:ResourceBundle
         var username:String?=null
        @BeforeAll
        @JvmStatic
        fun getUrl(){
            resourceBundle=ResourceBundle.getBundle("db")
            username= resourceBundle.getString("username")
        }

        @AfterAll
        @JvmStatic
        fun setUrl(){

            username=null

        }
    }

    @Test
    fun testDbUserName(){
        assertEquals("root", username)
    }


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

    @Order(1)
    @ParameterizedTest(name = "isMember")
    @CsvFileSource(resources = ["members.csv"], numLinesToSkip = 1)
    @DisplayName("Check member id and name")
    fun `Function isMember returns true from CSV`(id:Long,name: String) {
        member.memberId=id
        member.name=name
        assertTrue(member.memberId >0 )
    }
   
}
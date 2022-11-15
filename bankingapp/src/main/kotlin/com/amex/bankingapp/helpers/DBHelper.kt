package com.amex.bankingapp.helpers

import java.sql.Connection
import java.sql.DriverManager
import java.util.*

object DBHelper {

    val url: String?

    val userName: String?
    val password: String?
    val driver: String?
    internal var conn: Connection? = null

    init {
        val resource = ResourceBundle.getBundle("db")
        url = resource.getString("url")

        userName =resource.getString("username")
        password = resource.getString("password")
        driver=resource.getString("driver")

    }


    fun getConnection(): Connection? {
        Class.forName(driver)
        return DriverManager.getConnection(url,userName, password)
    }
}
package com.amex.bankingapp.helpers

import com.amex.bankingapp.exceptions.PasswordNotFound
import com.amex.bankingapp.exceptions.ResourceNotFound
import com.amex.bankingapp.exceptions.UrlNotFound
import com.amex.bankingapp.exceptions.UserNameNotFound
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
        if(url==null){
            throw UrlNotFound()
        }
        try {
            userName = resource.getString("username")
        }
        catch(missing:MissingResourceException){
            throw ResourceNotFound()
        }
        if(userName.length == 0){
            throw UserNameNotFound()
        }
        password = resource.getString("password")
        if(password==null){
            throw PasswordNotFound()
        }
        driver=resource.getString("driver")
    }


    fun getConnection(): Connection? {
        Class.forName(driver)
        return DriverManager.getConnection(url,userName, password)
    }
}
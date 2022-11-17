package com.amex.customerapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomerappApplication

fun main(args: Array<String>) {
	runApplication<CustomerappApplication>(*args)
}

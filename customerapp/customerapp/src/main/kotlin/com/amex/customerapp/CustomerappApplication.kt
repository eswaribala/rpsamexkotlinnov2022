package com.amex.customerapp

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(info = Info(title = "Customer API", version = "2.0", description = "Customer Information"))
class CustomerappApplication

fun main(args: Array<String>) {
	runApplication<CustomerappApplication>(*args)
}

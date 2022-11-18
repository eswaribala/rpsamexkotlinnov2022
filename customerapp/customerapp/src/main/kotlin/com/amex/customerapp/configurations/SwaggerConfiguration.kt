package com.amex.customerapp.configurations

import com.amex.customerapp.controllers.IndividualController
import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfiguration {

    @Bean
    fun apiv1():GroupedOpenApi{

        return GroupedOpenApi.builder().group("v1.0")
            .packagesToScan("com.amex.customerapp").build()
    }
}
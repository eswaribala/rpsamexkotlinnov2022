package com.amex.customerapp.configurations



import io.swagger.v3.oas.models.ExternalDocumentation
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class SwaggerConfiguration {
/*
    @Bean
    fun individualv1():GroupedOpenApi{
            return GroupedOpenApi.builder()
                .group("individuals/v1.0")
                .packagesToScan("com.amex.customerapp")
                .pathsToMatch("/v3/api-docs/individuals/v1.0")
                .build();
            }
*/
    @Bean
    fun springShopOpenAPI(): OpenAPI? {
        return OpenAPI()
            .info(
                Info().title("Customer API")
                    .description("Customer Kotlin API")
                    .version("v0.0.1")
                    .license(License().name("Apache 2.0").url("http://springdoc.org"))
            )
            .externalDocs(
                ExternalDocumentation()
                    .description("SpringShop Wiki Documentation")
                    .url("https://springshop.wiki.github.org/docs")
            )
    }
}
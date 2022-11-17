package com.amex.abcbankapp.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


/**
 * Controller for REST API endpoints
 */
@RestController
class EmployeeController {

    @GetMapping("/employees")
    fun getAllEmployees(): ResponseEntity<Any> {
          return ResponseEntity.status(HttpStatus.OK).body("Found Data")
    }

   }

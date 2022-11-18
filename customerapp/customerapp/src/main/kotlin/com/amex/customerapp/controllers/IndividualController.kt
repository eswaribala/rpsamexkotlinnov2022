package com.amex.customerapp.controllers

import com.amex.customerapp.dtos.DataWrapper
import com.amex.customerapp.models.Individual
import com.amex.customerapp.services.IndividualService
import com.example.api.controller.model.IndividualDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
//import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("individuals")
//@Api(value = "Individual Management", protocols = "http")
class IndividualController(private val individualService: IndividualService) {

    @GetMapping("/v1.0")
    fun getAllIndividuals(): List<IndividualDto> {

        return individualService.getAllIndividuals().map {
            IndividualDto.from(it)
        }


    }

    @GetMapping("/v1.0/{id}")
    fun getIndividualsById(@PathVariable("id") IndividualId: Long): ResponseEntity<DataWrapper<Any>> {
       // return IndividualDto.from(individualService.getIndividualById(IndividualId))

        var individual:Individual?=individualService.getIndividualById(IndividualId);
        if(individual!=null)
            return ResponseEntity.status(HttpStatus.OK).body(DataWrapper(individual));
        else
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(DataWrapper("Customer Info not correct"));
    }

    @PostMapping("/v1.0")
    fun createIndividual(@RequestBody payload: Individual): IndividualDto {
        return IndividualDto.from(individualService.addIndividual(payload));
    }
/*
    @PutMapping("/Individuals/{id}")
    fun updateIndividualById(@PathVariable("id") individualId: Long,  @RequestBody payload: Individual) : IndividualDto {
        return IndividualDto.from(individualService.updateIndividualById(IndividualId, Individual.from(payload)))
    }
*/
    @DeleteMapping("/v1.0/{id}")
    fun deleteIndividualsById(@PathVariable("id") individualId: Long): Boolean {
        return individualService.deleteIndividualById(individualId)
    }
}

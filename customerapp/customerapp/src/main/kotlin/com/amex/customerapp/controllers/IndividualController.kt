package com.amex.customerapp.controllers

import com.amex.customerapp.models.Individual
import com.amex.customerapp.services.IndividualService
import com.example.api.controller.model.IndividualDto
//import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/individuals")
//@Api(value = "Individual Management", protocols = "http")
class IndividualController(private val individualService: IndividualService) {

    @GetMapping("/")
    fun getAllIndividuals(): List<IndividualDto> {
        return individualService.getAllIndividuals().map {
            IndividualDto.from(it)
        }
    }

    @GetMapping("/{id}")
    fun getIndividualsById(@PathVariable("id") IndividualId: Long): IndividualDto {
        return IndividualDto.from(individualService.getIndividualById(IndividualId))
    }

    @PostMapping("/")
    fun createIndividual(@RequestBody payload: Individual): IndividualDto {
        return IndividualDto.from(individualService.addIndividual(payload));
    }
/*
    @PutMapping("/Individuals/{id}")
    fun updateIndividualById(@PathVariable("id") individualId: Long,  @RequestBody payload: Individual) : IndividualDto {
        return IndividualDto.from(individualService.updateIndividualById(IndividualId, Individual.from(payload)))
    }
*/
    @DeleteMapping("/{id}")
    fun deleteIndividualsById(@PathVariable("id") individualId: Long): Boolean {
        return individualService.deleteIndividualById(individualId)
    }
}

package com.example.crm.controller

import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead
import com.example.crm.service.LeadService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/lead")
class LeadController {

    @Autowired
    lateinit var leadService: LeadService

    @GetMapping
    fun getLead(): List<Lead> {
        return leadService.getLead()
    }

    @PostMapping
    fun save (@RequestBody @Valid leadDto: LeadDto): Lead {
        return leadService.save(leadDto)
    }
}
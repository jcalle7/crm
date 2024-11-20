package com.example.crm.service

import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead
import com.example.crm.mapper.LeadMapper
import com.example.crm.repository.LeadRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LeadService {

    @Autowired
    lateinit var leadRepository: LeadRepository

    fun getLead(): List<Lead> {
        return leadRepository.findAll()
    }

    fun save (leadDto: LeadDto): Lead {
        val lead = LeadMapper.toEntity(leadDto)
        return leadRepository.save(lead)
    }
}
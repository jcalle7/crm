package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class LeadDto {

    @NotNull(message = "Status is required")
    @NotBlank(message = "Status fill up all required")
    var status: String? = null
}
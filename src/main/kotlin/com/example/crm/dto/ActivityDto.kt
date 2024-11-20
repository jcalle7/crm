package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class ActivityDto {

    @NotNull(message = "Description is required")
    @NotBlank(message = "Description is required")
    var description: String? = null
}
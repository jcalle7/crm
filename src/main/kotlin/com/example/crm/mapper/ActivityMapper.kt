package com.example.crm.mapper

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity

object ActivityMapper {

    fun toEntity(activityDto: ActivityDto): Activity {
        val activity = Activity()
        activity.description = activityDto.description
        return activity
    }
}
package com.example.crm.controller

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity
import com.example.crm.service.ActivityService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/activity")
class ActivityController {

    @Autowired
    lateinit var activityService: ActivityService

    @GetMapping
    fun getActivity(): List<Activity> {
        return activityService.getActivity()
    }

    @PostMapping
    fun save (@RequestBody @Valid activityDto: ActivityDto): Activity {
        return activityService.save(activityDto)
    }
}
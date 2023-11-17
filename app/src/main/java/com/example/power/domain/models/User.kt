package com.example.power.domain.models

import com.example.power.domain.models.enum.Weight
import java.time.LocalDateTime

data class User (
    val userId:Int,
    val name:Int,
    val age:Int,
    val dob:LocalDateTime,
    val weight:Weight
)
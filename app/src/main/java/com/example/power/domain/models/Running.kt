package com.example.power.domain.models

import java.time.Duration
import java.time.LocalDateTime

data class Running (
    val runId:Int,
    val calories:Int,
    val duration: Duration,
    val distance:Float,
    val speed:Float,
    val date:LocalDateTime
        )
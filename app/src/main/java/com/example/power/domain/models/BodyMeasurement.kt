package com.example.power.domain.models

import com.example.power.domain.models.enum.BodyParts
import java.time.LocalDateTime

data class BodyMeasurement (
    val measurementId : Int,
    val date:LocalDateTime,
    val bodyParts: BodyParts,
    val measurement:Float
    )
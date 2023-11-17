package com.example.power.domain.models

import com.example.power.domain.models.enum.Weight

data class Exercise (
    val exerciseId:Int,
    val exerciseDetails: ExerciseDetails,
    val reps:Int,
    val sets:Int,
    val weight:Weight
        )
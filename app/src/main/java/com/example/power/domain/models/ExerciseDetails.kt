package com.example.power.domain.models

import com.example.power.domain.models.enum.ExerciseType
import com.example.power.domain.models.enum.MuscleGroup

data class ExerciseDetails (
    val exerciseDetailsId:Int,
    val exerciseName:String,
    val primaryMuscleGroup:MuscleGroup,
    val secondaryMuscleGroup:MuscleGroup,
    val ExerciseType:ExerciseType,
    val isTimerRequired:Boolean
        )
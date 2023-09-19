package com.example.power.ui.theme

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(ThemeConstants.CornerRadius.small),
    medium = RoundedCornerShape(ThemeConstants.CornerRadius.medium),
    large = RoundedCornerShape(ThemeConstants.CornerRadius.large),
)

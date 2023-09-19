package com.example.power.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.power.R

object ThemeConstants {
    object CornerRadius{
        val extraSmall = 6.dp
        val small = 8.dp
        val medium = 10.dp
        val large = 12.dp
        val extraLarge = 14.dp
    }
    object Padding{
        val extraSmall = 4.dp
        val small = 6.dp
        val medium = 8.dp
        val large = 10.dp
        val extraLarge = 12.dp
    }
    object FontSize{
        val heading = 24.sp //h1
        val subHeading = 18.sp //h2
        val body1 = 16.sp
        val body2 = 16.sp
        val caption = 12.sp
        val btnTxtSmall = 8.sp
        val btnTxtMedium = 10.sp
    }

        val myFontFamily = FontFamily(
            Font(R.font.inter_extra_light, weight = FontWeight.ExtraLight),
            Font(R.font.inter_light,weight = FontWeight.Light),
            Font(R.font.inter_thin,weight = FontWeight.Thin),
            Font(R.font.inter_regular,weight = FontWeight.Normal),
            Font(R.font.inter_medium,weight = FontWeight.Medium),
            Font(R.font.inter_semi_bold,weight = FontWeight.SemiBold),
            Font(R.font.inter_bold,weight = FontWeight.Bold),
            Font(R.font.inter_extra_bold,weight = FontWeight.ExtraBold),
        )

}
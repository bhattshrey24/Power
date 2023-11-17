package com.example.power.domain.models.enum

sealed class Weight() {
 data class KG(var value:Int, var unit:String="KG"):Weight()
    data class P(var value:Int, var unit:String="P"):Weight()
}
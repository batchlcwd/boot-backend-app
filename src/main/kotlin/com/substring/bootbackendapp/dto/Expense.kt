package com.substring.bootbackendapp.dto

import java.time.LocalDate

data class Expense(
    val id: Long,
    val description: String,
    val amount: Double,
    val date: LocalDate
)

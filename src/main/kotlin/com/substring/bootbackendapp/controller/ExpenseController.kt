package com.substring.bootbackendapp.controller

import com.substring.bootbackendapp.dto.Expense
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/api/v1/expenses")
class ExpenseController {

    //    get all expenses
    @GetMapping
    fun getAllExpenses(): List<Expense> {
        return listOf(
            Expense(1, "test", 1.0, LocalDate.now()),
            Expense(2, "test2", 2.0, LocalDate.now())
        )
    }
}
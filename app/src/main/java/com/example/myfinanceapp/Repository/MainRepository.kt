package com.example.myfinanceapp.Repository

import com.example.myfinanceapp.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurant", price = 573.12, pic = "restaurant", time = "17 June 2025 19:15"),
        ExpenseDomain("McDonald", price = 77.82, pic = "mcdonald", time = "16 June 2025 13:57"),
        ExpenseDomain("Cinema", price = 23.47, pic = "cinema", time = "16 June 2025 20:45"),
        ExpenseDomain("Restaurant", price = 573.12, pic = "restaurant", time = "15 June 2025 22:18")
    )
}
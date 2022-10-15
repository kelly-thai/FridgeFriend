package com.example.fridgefriend

import androidx.annotation.DrawableRes

class Food (
    @DrawableRes val imageResourceId: Int, //r.drawable.dairy for example
    val name: String,
    val quantity: String,
    val expiration_date: String
)

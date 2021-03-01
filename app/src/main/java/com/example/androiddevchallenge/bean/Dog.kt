package com.example.androiddevchallenge.bean

import androidx.annotation.DrawableRes

data class Dog(val name: String, val age: Int, @DrawableRes val picRes: Int, val address: String)

package com.example.armoury.model

import androidx.compose.ui.graphics.Color

data class Weapons(
    val name: String,
    val status: String = "Unequipped", // Default value
    val cardColor: Color = Color(0xFFF1F1F1) // Default neutral light gray
)
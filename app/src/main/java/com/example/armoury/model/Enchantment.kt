package com.example.armoury.model

data class Enchantment(
    val name: String,
    val type: String,
    val realm: String,
    val description: String,
    val rarity: String,
    val stats: List<String>,
    val colorHex: String // The hex code you will use for the background
)
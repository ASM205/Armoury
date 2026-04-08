package com.example.armoury.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class EnchantmentStatus(
    val name: String,
    val colorHex: String
)
class ArmouryViewModel : ViewModel() {
    // This tracks which weapon is currently being viewed/selected
    private val _selectedWeapon = MutableStateFlow<String?>(null)
    val selectedWeapon: StateFlow<String?> = _selectedWeapon.asStateFlow()

    // This tracks the "Equipped" status for each weapon
    // Map of Weapon Name -> Enchantment Name
    private val _equippedEnchantments = MutableStateFlow<Map<String, EnchantmentStatus>>(emptyMap())
    val equippedEnchantments: StateFlow<Map<String, EnchantmentStatus>> = _equippedEnchantments.asStateFlow()

    fun selectWeapon(weaponName: String?) {
        _selectedWeapon.value = weaponName
    }

    fun equipEnchantment(weapon: String, enchantmentName: String, color: String) {
        val currentMap = _equippedEnchantments.value.toMutableMap()

        // Create the object that holds both pieces of info
        currentMap[weapon] = EnchantmentStatus(
            name = enchantmentName,
            colorHex = color
        )

        _equippedEnchantments.value = currentMap
    }
}
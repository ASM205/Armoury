package com.example.armoury.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.armoury.model.Weapons
import com.example.armoury.ui.viewmodel.EnchantmentStatus

@Composable
fun WeaponCard(weapon: Weapons, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = weapon.cardColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally // Centering text inside card
        ) {
            Text(text = weapon.name, style = MaterialTheme.typography.titleLarge)
            Text(text = weapon.status, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Composable
fun HomeScreen(
    equippedInfo: Map<String, EnchantmentStatus>,
    onWeaponClick: (String) -> Unit
) {
    val weapons = listOf(
        Weapons("Sword"),
        Weapons("Axe"),
        Weapons("Bow & Arrow"),
        Weapons("Blades of Chaos"),
        Weapons("Breastplate"),
        Weapons("Shoulder Guard"),
        Weapons("Gauntlets")
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            items(weapons) { weapon ->
                // 1. Look up the status for this weapon name
                val status = equippedInfo[weapon.name]

                // 2. Decide the display data
                val (finalStatusText, finalColor) = if (status != null) {
                    // It's enchanted! Use the status name and parse the hex color
                    val enchantedColor = Color(android.graphics.Color.parseColor(status.colorHex))
                    "Enchanted: ${status.name}" to enchantedColor
                } else {
                    // Not enchanted. Use default values.
                    "Unequipped" to weapon.cardColor
                }

                // 3. Create a temporary "display" version of the weapon
                val displayWeapon = weapon.copy(
                    status = finalStatusText,
                    cardColor = finalColor
                )

                WeaponCard(
                    weapon = displayWeapon,
                    onClick = { onWeaponClick(weapon.name) }
                )
            }
        }
    }
}
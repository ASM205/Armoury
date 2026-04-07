package com.example.armoury.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.armoury.model.Weapons
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.armoury.ui.theme.ArmouryTheme
import android.R.attr.onClick
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment


@Composable
fun WeaponCard(weapon: Weapons, onClick : ()-> Unit) {
    //name status colur
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = weapon.cardColor) // Uses the color from the object
        ) {
        Column() {
            Text(text = weapon.name)
            Text(text = weapon.status)
        }
    }
}

@Composable
fun HomeScreen(
    equippedInfo: Map<String, String>,
    onWeaponClick: (String) -> Unit
) {
    // This is your list of 7 items
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
        verticalArrangement = Arrangement.Center,    // Centers vertically
        horizontalAlignment = Alignment.CenterHorizontally // Centers horizontally
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            items(weapons) { weapon ->
                WeaponCard(weapon, { onWeaponClick(weapon.name) })
            }
        }
    }
}


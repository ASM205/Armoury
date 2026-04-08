package com.example.armoury.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.armoury.data.EnchantmentData
import com.example.armoury.model.Enchantment

// Extension property for color parsing
val Enchantment.color: Color
    get() = Color(android.graphics.Color.parseColor(this.colorHex))

@Composable
fun EnchantmentCard(
    enchantment: Enchantment,
    onCardClick: () -> Unit // NEW: Parameter to handle the click
) {
    Card(
        onClick = onCardClick, // NEW: Attached the callback here
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = enchantment.color)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Title
            Text(
                text = enchantment.name,
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center
            )

            // Realm Tag
            Card(
                modifier = Modifier.padding(vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black.copy(alpha = 0.1f))
            ) {
                Text(
                    text = enchantment.realm,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                    style = MaterialTheme.typography.labelMedium
                )
            }

            // Description
            Text(
                text = enchantment.description,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // Stats and Rarity Row
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = enchantment.stats.joinToString(", "),
                    style = MaterialTheme.typography.bodySmall
                )

                Spacer(modifier = Modifier.padding(horizontal = 8.dp))

                Card(colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.5f))) {
                    Text(
                        text = enchantment.rarity,
                        modifier = Modifier.padding(horizontal = 6.dp),
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
        }
    }
}

@Composable
fun EnchantmentScreen(
    type: String,
    onBack: () -> Unit,
    onEnchantmentSelect: (Enchantment) -> Unit // NEW: Callback to send data back to ViewModel
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Select $type Enchantment",
            style = MaterialTheme.typography.displaySmall,
            textAlign = TextAlign.Center
        )

        Button(
            onClick = onBack,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text(text = "Back to Armoury")
        }

        LazyColumn(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(EnchantmentData.allEnchantments) { enchantment ->
                if (enchantment.type == type) {
                    EnchantmentCard(
                        enchantment = enchantment,
                        onCardClick = { onEnchantmentSelect(enchantment) } // NEW: Triggering the selection
                    )
                }
            }
        }
    }
}
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
import com.example.armoury.data.EnchantmentData
import com.example.armoury.model.Enchantment
import com.example.armoury.ui.theme.ArmouryTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Row

// This adds a .color property to every Enchantment automatically
val Enchantment.color: Color
    get() = Color(android.graphics.Color.parseColor(this.colorHex))

@Composable
fun EnchantmentCard(enchantment: Enchantment) {
    //name status colur
    Card(
        onClick = {  },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = enchantment.color) // Uses the color from the object
    ) {
        Column() {
            //title realm desc
            Text(text = enchantment.name)
            Text(text = enchantment.realm)
            Text(text = enchantment.description)
            Row(){
                //stats rarity
                Text(text = enchantment.stats.joinToString (", " ))
                Text(text = enchantment.rarity)

            }

        }
    }
}
@Composable
fun EnchantmentScreen(type :String) {

    Text(text = type)

    LazyColumn {
        items(EnchantmentData.allEnchantments) { enchantment ->
            if (enchantment.type == type) {
                EnchantmentCard(enchantment)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EnchantmentScreenPreview() {
    EnchantmentScreen("Sword")
}
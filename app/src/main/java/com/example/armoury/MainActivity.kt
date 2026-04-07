package com.example.armoury

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.armoury.screens.EnchantmentScreen
import com.example.armoury.screens.HomeScreen
import com.example.armoury.ui.theme.ArmouryTheme
import com.example.armoury.ui.viewmodel.ArmouryViewModel

class MainActivity : ComponentActivity() {
    val viewModel: ArmouryViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArmouryTheme {

                // 2. Collect the current state (The "Live" data)
                val selectedWeapon by viewModel.selectedWeapon.collectAsState()
                val equippedMap by viewModel.equippedEnchantments.collectAsState()

                // 3. The Switch: Decide what to show
                if (selectedWeapon == null) {
                    // THIS IS WHERE YOUR CODE GOES
                    HomeScreen(
                        equippedInfo = equippedMap,
                        onWeaponClick = { name -> viewModel.selectWeapon(name) }
                    )
                } else {
                    // Show the other screen if a weapon is picked
                    EnchantmentScreen(
                        type = selectedWeapon!!,
                        onBack = { viewModel.selectWeapon(null) }
                    )
                }
            }
        }
    }
}


package com.example.armoury

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.armoury.screens.EnchantmentScreen
import com.example.armoury.screens.HomeScreen
import com.example.armoury.ui.theme.ArmouryTheme
import com.example.armoury.ui.viewmodel.ArmouryViewModel

class MainActivity : ComponentActivity() {
    // ViewModel setup
    private val viewModel: ArmouryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                // Surface provides a background and proper text coloring
                Surface(modifier = Modifier.fillMaxSize()) {

                    // 1. Observe the StateFlows from the ViewModel
                    val selectedWeapon by viewModel.selectedWeapon.collectAsState()
                    val equippedMap by viewModel.equippedEnchantments.collectAsState()

                    // 2. Navigation Logic
                    if (selectedWeapon == null) {
                        HomeScreen(
                            equippedInfo = equippedMap,
                            onWeaponClick = { name -> viewModel.selectWeapon(name) }
                        )
                    } else {
                        EnchantmentScreen(
                            type = selectedWeapon!!,
                            onBack = { viewModel.selectWeapon(null) },
                            // MATCHED the name to your EnchantmentScreen's parameter
                            onEnchantmentSelect = { enchantment ->
                                // Update the Map in the ViewModel
                                viewModel.equipEnchantment(
                                    weapon = selectedWeapon!!,
                                    enchantmentName = enchantment.name,
                                    color = enchantment.colorHex
                                )
                                // Return to Home Screen
                                viewModel.selectWeapon(null)
                            }
                        )
                    }
                }
            }
        }
    }

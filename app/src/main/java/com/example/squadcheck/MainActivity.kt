package com.example.squadcheck

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.squadcheck.ui.screens.HomeScreen
import com.example.squadcheck.ui.theme.SquadCheckTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SquadCheckTheme {
                Surface {
                    HomeScreen()
                }
            }
        }
    }
}
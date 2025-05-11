package com.example.squadcheck.viewmodels

import androidx.lifecycle.ViewModel
import com.example.squadcheck.models.Habit

class HabitViewModel : ViewModel() {
    val habits = listOf(
        Habit("Gym", 12, currentStreak = 7),
        Habit("Sleep", 10, currentStreak = 3)
    )
}
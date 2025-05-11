package com.example.squadcheck.models

data class Habit(
    val name: String,
    val points: Int,
    val currentStreak: Int = 0,
    val bestStreak: Int = 0,
    val weeklyProgress: Float = 0f,
    val id: Int = (0..1000).random()
)
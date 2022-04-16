package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Creating a binding object for the main_activity.xml layout
        binding = ActivityMainBinding.inflate(layoutInflater)

// Referencing a view with the ID roll_button
        binding.rollButton
    }
}
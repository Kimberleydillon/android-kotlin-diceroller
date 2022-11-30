package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        binding.rollbutton.text = "FUN TIMES"
        binding.rollbutton.setOnClickListener {
            rollDice()
        }
        setContentView(view)

    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1

        binding.resultText.text = randomInt.toString()
    }
}
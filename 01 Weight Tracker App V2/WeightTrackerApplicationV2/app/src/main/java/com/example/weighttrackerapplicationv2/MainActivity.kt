package com.yourname.weighttracker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var currentWeightValue: TextView
    private lateinit var weightInput: TextInputEditText
    private lateinit var addWeightButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        currentWeightValue = findViewById(R.id.current_weight_value)
        weightInput = findViewById(R.id.weight_input)
        addWeightButton = findViewById(R.id.add_weight_button)

        addWeightButton.setOnClickListener { addWeight() }

        findViewById<Button>(R.id.view_history_button).setOnClickListener {
            Toast.makeText(this, "History feature coming soon!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.set_goal_button).setOnClickListener {
            Toast.makeText(this, "Goal setting feature coming soon!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun addWeight() {
        val weightStr = weightInput.text?.toString()?.trim().orEmpty()

        if (weightStr.isBlank()) {
            Toast.makeText(this, "Please enter a weight value", Toast.LENGTH_SHORT).show()
            return
        }

        val weight = weightStr.toDoubleOrNull()
        if (weight == null) {
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            return
        }

        if (weight <= 0 || weight > 1500) {
            Toast.makeText(this, "Please enter a realistic weight", Toast.LENGTH_SHORT).show()
            return
        }

        currentWeightValue.text = weight.toString()
        weightInput.setText("")
        Toast.makeText(this, "Weight added successfully!", Toast.LENGTH_SHORT).show()
    }
}

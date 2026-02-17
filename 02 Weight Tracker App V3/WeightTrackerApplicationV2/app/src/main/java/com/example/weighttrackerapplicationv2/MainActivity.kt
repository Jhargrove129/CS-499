package com.yourname.weighttracker

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var currentWeightValue: TextView? = null
    private var weightInput: EditText? = null
    private var addWeightButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize views
        currentWeightValue = findViewById<TextView?>(R.id.current_weight_value)
        weightInput = findViewById<EditText?>(R.id.weight_input)
        addWeightButton = findViewById<Button?>(R.id.add_weight_button)


        // Set click listeners
        addWeightButton!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                addWeight()
            }
        })

        findViewById<View?>(R.id.view_history_button).setOnClickListener(View.OnClickListener { v: View? ->
            Toast.makeText(
                this,
                "History feature coming soon!",
                Toast.LENGTH_SHORT
            ).show()
        }
        )

        findViewById<View?>(R.id.set_goal_button).setOnClickListener(View.OnClickListener { v: View? ->
            Toast.makeText(
                this,
                "Goal setting feature coming soon!",
                Toast.LENGTH_SHORT
            ).show()
        }
        )
    }

    private fun addWeight() {
        val weightStr = weightInput!!.getText().toString()
        if (!weightStr.isEmpty()) {
            try {
                val weight = weightStr.toDouble()
                currentWeightValue!!.setText(weight.toString())
                weightInput!!.setText("")
                Toast.makeText(this, "Weight added successfully!", Toast.LENGTH_SHORT).show()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please enter a weight value", Toast.LENGTH_SHORT).show()
        }
    }
}
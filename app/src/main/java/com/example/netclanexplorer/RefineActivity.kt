package com.example.netclanexplorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.ToggleButton

class RefineActivity : AppCompatActivity() {
    private var isButtonPressed1 = false
    private var isButtonPressed2 = false
    private var isButtonPressed3 = false
    private var isButtonPressed4 = false
    private var isButtonPressed5 = false
    private var isButtonPressed6 = false
    private var isButtonPressed7 = false
    private var isButtonPressed8 = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refine)




        val spinner: Spinner = findViewById(R.id.spinner)
        val items = listOf("Avaible | Hey connect With us", "Item 2", "Item 3", "Item 4")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val textBox = findViewById<EditText>(R.id.textDescripton)
        textBox.setText("Hi community! I am open to new connections &quot;😊&quot;")


        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        val button1 = findViewById<Button>(R.id.b1)
        button1.setOnClickListener {
            isButtonPressed1 = !isButtonPressed1
            updateButtonState(button1, isButtonPressed1)
        }

        val button2 = findViewById<Button>(R.id.b2)
        button2.setOnClickListener {
            isButtonPressed2 = !isButtonPressed2
            updateButtonState(button2, isButtonPressed2)
        }

        val button3 = findViewById<Button>(R.id.b3)
        button3.setOnClickListener {
            isButtonPressed3 = !isButtonPressed3
            updateButtonState(button3, isButtonPressed3)
        }

        val button4 = findViewById<Button>(R.id.b4)
        button4.setOnClickListener {
            isButtonPressed4 = !isButtonPressed4
            updateButtonState(button4, isButtonPressed4)
        }

        val button5 = findViewById<Button>(R.id.b5)
        button5.setOnClickListener {
            isButtonPressed5 = !isButtonPressed5
            updateButtonState(button5, isButtonPressed5)
        }

        val button6 = findViewById<Button>(R.id.b6)
        button6.setOnClickListener {
            isButtonPressed6 = !isButtonPressed6
            updateButtonState(button6, isButtonPressed6)
        }

        val button7 = findViewById<Button>(R.id.b7)
        button7.setOnClickListener {
            isButtonPressed7 = !isButtonPressed7
            updateButtonState(button7, isButtonPressed7)
        }

        val button8 = findViewById<Button>(R.id.b8)
        button8.setOnClickListener {
            isButtonPressed8 = !isButtonPressed8
            updateButtonState(button8, isButtonPressed8)
        }


    }

    private fun updateButtonState(button: Button, isPressed: Boolean) {
        if (isPressed) {
            button.setBackgroundResource(R.drawable.background3)
            button.setTextColor(resources.getColor(R.color.white))
            // Perform the action you want when the button is pressed
        } else {
            button.setBackgroundResource(R.drawable.background2)
            button.setTextColor(resources.getColor(R.color.nox))
            // Perform the action you want when the button is released
        }
    }

}


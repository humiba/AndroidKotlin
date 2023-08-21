package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Usage elements
        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.etName)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnOffers = findViewById<Button>(R.id.btnOffers)
        var enteredName = ""

        btnSubmit.setOnClickListener {
            enteredName = inputField.text.toString()

            if (enteredName == "") {
                btnOffers.visibility = INVISIBLE
                greetingTextView.text = ""
                Toast.makeText(this@MainActivity, "Please enter your name!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val message = "Hello $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
                btnOffers.visibility = VISIBLE
            }
        }

        btnOffers.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", enteredName) // Pass data through Activities
            startActivity(intent)
        }
    }
}
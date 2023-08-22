package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        Log.i("MyTag", "MainActivity : OnCreate")

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
                Log.i("MyTag", message)
                greetingTextView.text = message
                Log.i("MyTag", "After displaying the message on the TextView")
                inputField.text.clear()
                btnOffers.visibility = VISIBLE
            }
        }

        btnOffers.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            // Pass data through Activities (component)
            intent.putExtra("USER", enteredName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "MainActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "MainActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "MainActivity : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "MainActivity : OnStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag", "MainActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTag", "MainActivity : OnRestart")
    }
}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("MyTagSecond", "SecondActivity : OnCreate")

        val username = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$username, you will get free access to all the content for one month"

        textView.text = message
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTagSecond", "SecondActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTagSecond", "SecondActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTagSecond", "SecondActivity : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTagSecond", "SecondActivity : OnStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTagSecond", "SecondActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTagSecond", "SecondActivity : OnRestart")
    }
}
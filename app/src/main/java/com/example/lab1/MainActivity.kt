package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.sydney)
        val textView = findViewById<TextView>(R.id.textView2)
        button.setOnClickListener{
            //Toast.makeText(it.context, "Click Button!", Toast.LENGTH_LONG).show()
            counter++
            textView.text = counter.toString()
        }
    }
}
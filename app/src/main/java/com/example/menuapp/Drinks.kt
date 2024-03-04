package com.example.menuapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Drinks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drinks)

        val button = findViewById<Button>(R.id.btnDrink)
        button.setOnClickListener {
            val toast = Toast.makeText(this,"Your order has been placed please wait",Toast.LENGTH_LONG)
            toast.show()
        }
    }
}
package com.example.menuapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Snacks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.snacks)

        val order = findViewById<Button>(R.id.btnSnack)
        order.setOnClickListener {
            val toast = Toast.makeText(this, "Your order has been placed please wait", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}
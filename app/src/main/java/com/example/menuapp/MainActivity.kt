package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val snacks = findViewById<CardView>(R.id.crdSnacks)
        val mainC = findViewById<CardView>(R.id.crdMain)
        val drinks = findViewById<CardView>(R.id.crdDrinks)

        snacks.setOnClickListener {
            intent = Intent(this, Snacks :: class.java)
            startActivity(intent)
        }

        mainC.setOnClickListener {
            intent = Intent(this, MainCourse :: class.java)
            startActivity(intent)
        }

        drinks.setOnClickListener {
            intent = Intent(this, Drinks :: class.java)
            startActivity(intent)
        }

    }
}
package com.example.examfiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class branches2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branches2)

        val cardAiml = findViewById<CardView>(R.id.cardViewAiml)

        cardAiml.setOnClickListener {
            val intentAiml = Intent(this,year2::class.java)
            startActivity(intentAiml)
        }
    }
}
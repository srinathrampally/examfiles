package com.example.examfiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class branch1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branch1)

        val cardAiml = findViewById<CardView>(R.id.cardViewAiml)

        cardAiml.setOnClickListener {
            val intentAiml = Intent(this,year1::class.java)
            startActivity(intentAiml)
        }
    }
}
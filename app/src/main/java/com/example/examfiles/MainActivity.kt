package com.example.examfiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val card1 = findViewById<CardView>(R.id.cardview1)
        val card2 = findViewById<CardView>(R.id.cardView2)
        val card3 = findViewById<CardView>(R.id.cardView3)
        val card4 = findViewById<CardView>(R.id.cardView4)

        card1.setOnClickListener {
            val intent1 = Intent(this,branch1::class.java)
            startActivity(intent1)
        }
        card2.setOnClickListener {
            val intent2 = Intent(this,branches2::class.java)
            startActivity(intent2)
        }
        card3.setOnClickListener {
            val intent3 = Intent(this,branches3::class.java)
            startActivity(intent3)
        }
        card4.setOnClickListener {
            val intent4 = Intent(this,branches4::class.java)
            startActivity(intent4)
        }
    }

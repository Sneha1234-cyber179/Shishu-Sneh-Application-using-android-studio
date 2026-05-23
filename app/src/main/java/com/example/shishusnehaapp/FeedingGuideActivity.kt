package com.example.shishusnehaapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class FeedingGuideActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feeding_guide)

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()

        }
    }
}
package com.example.shishusnehaapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class GrowthChartActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.growth_chart)

        val etWeight = findViewById<EditText>(R.id.etWeight)
        val etHeight = findViewById<EditText>(R.id.etHeight)
        val btnGrowth = findViewById<Button>(R.id.btnGrowth)
        val tvGrowth = findViewById<TextView>(R.id.tvGrowth)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnGrowth.setOnClickListener {

            val weight = etWeight.text.toString().toDoubleOrNull()
            val height = etHeight.text.toString().toDoubleOrNull()

            if (weight == null || height == null) {

                tvGrowth.text = "Enter Valid Values"

            } else if (weight < 2.5 || height < 45) {

                tvGrowth.text = "Growth Needs Attention"

            } else {

                tvGrowth.text = "Growth is Normal"

            }
        }

        btnBack.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()

        }
    }
}
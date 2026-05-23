package com.example.shishusnehaapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val btnMotherForm = findViewById<Button>(R.id.btnMotherForm)
        val btnPrediction = findViewById<Button>(R.id.btnPrediction)
        val btnVaccination = findViewById<Button>(R.id.btnVaccination)
        val btnEmergency = findViewById<Button>(R.id.btnEmergency)
        val btnGrowth = findViewById<Button>(R.id.btnGrowth)
        val btnFeeding = findViewById<Button>(R.id.btnFeeding)

        btnMotherForm.setOnClickListener {

            val intent = Intent(this, MotherFormActivity::class.java)
            startActivity(intent)

        }

        btnPrediction.setOnClickListener {

            val intent = Intent(this, PredictionActivity::class.java)
            startActivity(intent)

        }

        btnVaccination.setOnClickListener {

            val intent = Intent(this, VaccinationActivity::class.java)
            startActivity(intent)

        }

        btnEmergency.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:108")
            startActivity(intent)

        }

        btnGrowth.setOnClickListener {

            val intent = Intent(this, GrowthChartActivity::class.java)
            startActivity(intent)

        }

        btnFeeding.setOnClickListener {

            val intent = Intent(this, FeedingGuideActivity::class.java)
            startActivity(intent)

        }
    }
}
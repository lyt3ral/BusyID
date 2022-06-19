package com.example.busyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayCardPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_card_page)

        val name: TextView = findViewById(R.id.Name)
        name.text = "Scanning for NFC Devices"

        val designation: TextView = findViewById(R.id.Designation)
        designation.text = "Scanning for NFC Devices"

        val email: TextView = findViewById(R.id.Email)
        email.text = "Scanning for NFC Devices"

        val phno: TextView = findViewById(R.id.Phno)
        phno.text = "Scanning for NFC Devices"

        val website: TextView = findViewById(R.id.Website)
        website.text = "Scanning for NFC Devices"
    }
}
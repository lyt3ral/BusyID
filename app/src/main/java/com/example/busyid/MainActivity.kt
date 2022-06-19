package com.example.busyid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentScan = Intent(this, ScanningPage::class.java)
        val obj = object: CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) {}
            override fun onFinish() {
                startActivity(intentScan)
            }
        }

        val tv: TextView = findViewById(R.id.Heading)
        tv.text = "BusyID"
        obj.start()

    }




}



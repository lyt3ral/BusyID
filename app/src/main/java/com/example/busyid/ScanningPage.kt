package com.example.busyid

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView

class ScanningPage : AppCompatActivity() {

    var videoView: VideoView? = null
    var mediaController: MediaController ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanning_page)

        val st: TextView = findViewById(R.id.ScanningText)
        st.text = "Scanning Now"

        videoView = findViewById<View>(R.id.videoView) as VideoView?

        if (mediaController == null) {
            mediaController = MediaController((this))
            mediaController!!.setAnchorView(this.videoView)
        }
        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.radarcolormatched))
        videoView!!.requestFocus()
        videoView!!.start()

        videoView!!.setOnCompletionListener {
            videoView!!.start()
        }
    }

}
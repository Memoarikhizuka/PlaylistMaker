package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.search)
        buttonSearch.setOnClickListener {
            val buttonSearchIntent = Intent(this, SearchActivity::class.java)
            startActivity(buttonSearchIntent)
        }

        val buttonMedia = findViewById<Button>(R.id.media)
        buttonMedia.setOnClickListener{
            val buttonMediaIntent=Intent(this, MediaActivity::class.java)
            startActivity(buttonMediaIntent)

        }

        val buttonSettings = findViewById<Button>(R.id.settings)
        buttonSettings.setOnClickListener {
            val buttonSettingIntent = Intent(this, SettingActivity::class.java)
            startActivity(buttonSettingIntent)
        }

    }
}
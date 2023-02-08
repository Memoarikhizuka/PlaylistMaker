package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    /* override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
     }*/

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.search)

        val buttonSearchClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку поиска!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        val buttonMedia = findViewById<Button>(R.id.media)

        val buttonMediaClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку Медиатека!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
         val buttonSettings = findViewById<Button>(R.id.settings)

        val buttonSettingsClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку Настройки!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        buttonSearch.setOnClickListener(buttonSearchClickListener)
        buttonMedia.setOnClickListener(buttonMediaClickListener)
        buttonSettings.setOnClickListener(buttonSettingsClickListener)
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.search)

        val buttonSearchClickListener: View.OnClickListener = View.OnClickListener {
        //    Toast.makeText(this@MainActivity, "Нажали на кнопку поиска!", Toast.LENGTH_SHORT)
        //        .show()
        }
        val buttonMedia = findViewById<Button>(R.id.media)

        val buttonMediaClickListener: View.OnClickListener = View.OnClickListener {
        //    Toast.makeText(this@MainActivity, "Нажали на кнопку Медиатека!", Toast.LENGTH_SHORT)
        //        .show()
        }
        val buttonSettings = findViewById<Button>(R.id.settings)

        buttonSettings.setOnClickListener{
            val buttonSettingIntent=Intent(this, SettingActivity::class.java)
        startActivity(buttonSettingIntent)
        }


        buttonSearch.setOnClickListener(buttonSearchClickListener)
        buttonMedia.setOnClickListener(buttonMediaClickListener)
      //  buttonSettings.setOnClickListener(buttonSettingsClickListener)
    }
}
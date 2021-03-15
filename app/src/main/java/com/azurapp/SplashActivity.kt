package com.azurapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class SplashActivity : AppCompatActivity() {

    private val delay : Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashScreen = findViewById<ImageView>(R.id.activity_splash)
        splashScreen.animate().setDuration(delay).alpha(1f).withEndAction{
            Toast.makeText(this,"Displayed Text After delay",Toast.LENGTH_LONG).show()
        }
    }

}
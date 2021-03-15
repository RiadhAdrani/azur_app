package com.azurapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    private val delay : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashScreen = findViewById<ImageView>(R.id.activity_splash)
        splashScreen.animate().setDuration(delay).alpha(1f).withEndAction{
            startActivity(Intent(baseContext, MainActivity::class.java))
            finish()
        }
    }

}
package com.azurapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.azurapp.fragments.BaseFragment
import com.azurapp.fragments.LandingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.menu_home -> {
                    // TODO : HOME
                    true
                }
                R.id.menu_search -> {
                    // TODO : SEARCH
                    true
                }
                R.id.menu_favorite -> {
                    // TODO : FAVORITE
                    true
                }
                else -> false
            }
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemReselectedListener { item ->
            when(item.itemId){
                R.id.menu_home -> {
                    // TODO : HOME
                }
                R.id.menu_search -> {
                    // TODO : SEARCH
                }
                R.id.menu_favorite -> {
                    // TODO : FAVORITE
                }
            }
        }

        val landingFragment = LandingFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.activity_main_fragment, landingFragment)
            .addToBackStack(null)
            .commit()

    }

    override fun onBackPressed() {

        val fragment = supportFragmentManager.findFragmentById(R.id.activity_main_fragment) as BaseFragment
        if (fragment.onBackPressed())
            super.onBackPressed()
        else
            finish()
    }
}
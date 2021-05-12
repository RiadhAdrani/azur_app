package com.azurapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.azurapp.fragments.BaseFragment
import com.azurapp.fragments.MainFragment
import com.azurapp.fragments.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    private fun pushFragment(
        fragment: BaseFragment,
        enterAnimRes: Int = R.anim.fade_in,
        exitAnimRes: Int = R.anim.fade_out,
        popEnterAnimRes: Int = R.anim.fade_in,
        popExitAnimRes: Int = R.anim.fade_out
    ) {
        val currentFragment =
            supportFragmentManager.findFragmentById(R.id.activity_main_fragment) as BaseFragment

        currentFragment.parentFragmentManager.commit {
            setCustomAnimations(
                enterAnimRes,
                exitAnimRes,
                popEnterAnimRes,
                popExitAnimRes
            )
            replace(R.id.activity_main_fragment, fragment)
            addToBackStack(fragment.tag())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    pushFragment(MainFragment())
                    true
                }
                R.id.menu_search -> {
                    pushFragment(SearchFragment())
                    true
                }
                R.id.menu_favorite -> {
                    pushFragment(SearchFragment())
                    true
                }
                else -> {
                    false
                }
            }
        }
        bottomNavigationView.setOnNavigationItemReselectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    if ((supportFragmentManager.findFragmentById(R.id.activity_main_fragment) as BaseFragment).tag() != MainFragment().tag()) {
                        pushFragment(MainFragment())
                    }
                }
                R.id.menu_search -> {
                    if ((supportFragmentManager.findFragmentById(R.id.activity_main_fragment) as BaseFragment).tag() != SearchFragment().tag()) {
                        pushFragment(SearchFragment())
                    }
                }
                R.id.menu_favorite -> {
                    // TODO : FAVORITE
                }
            }
        }

        val landingFragment = MainFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.activity_main_fragment, landingFragment)
            .addToBackStack(null)
            .commit()

    }

    override fun onBackPressed() {

        val fragment =
            supportFragmentManager.findFragmentById(R.id.activity_main_fragment) as BaseFragment

        if (fragment.onBackPressed()) {
            super.onBackPressed()

            if ((supportFragmentManager.findFragmentById(R.id.activity_main_fragment) as BaseFragment).tag() == SearchFragment().tag()) {
                bottomNavigationView.selectedItemId = R.id.menu_search
                return
            }

            if ((supportFragmentManager.findFragmentById(R.id.activity_main_fragment) as BaseFragment).tag() == MainFragment().tag()) {
                bottomNavigationView.selectedItemId = R.id.menu_home
                return
            }

        } else
            finish()
    }
}
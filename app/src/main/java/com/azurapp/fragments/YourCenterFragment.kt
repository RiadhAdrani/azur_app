package com.azurapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import com.azurapp.R
import com.github.chrisbanes.photoview.PhotoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YourCenterFragment : BaseFragment(R.layout.fragment_your_center) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "YOUR_CENTER_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        safePadding(view)

        val plan : PhotoView = view.findViewById(R.id.fragment_center_plan)

        val levelOne : FloatingActionButton = view.findViewById(R.id.fragment_level_1)
        levelOne.setOnClickListener {
            plan.setImageResource(R.drawable.your_center_level_1)
        }

        val levelZero : FloatingActionButton = view.findViewById(R.id.fragment_level_0)
        levelZero.setOnClickListener {
            plan.setImageResource(R.drawable.your_center_level_0)
        }

        val levelMinusOne : FloatingActionButton = view.findViewById(R.id.fragment_level__1)
        levelMinusOne.setOnClickListener {
            plan.setImageResource(R.drawable.your_center_level__1)
        }
    }
}
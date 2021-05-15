package com.azurapp.fragments

import android.graphics.PointF
import android.os.Bundle
import android.view.View
import com.azurapp.R
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YourCenterFragment : BaseFragment(R.layout.fragment_your_center) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "YOUR_CENTER_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        safePadding(view)

        val plan : SubsamplingScaleImageView = view.findViewById(R.id.fragment_center_plan)
        plan.setImage(ImageSource.resource(R.drawable.your_center_level_0))

        val levelOne : FloatingActionButton = view.findViewById(R.id.fragment_level_1)
        levelOne.setOnClickListener {
            plan.setImage(ImageSource.resource(R.drawable.your_center_level_1))
        }

        val levelZero : FloatingActionButton = view.findViewById(R.id.fragment_level_0)
        levelZero.setOnClickListener {
            plan.setImage(ImageSource.resource(R.drawable.your_center_level_0))
        }

        val levelMinusOne : FloatingActionButton = view.findViewById(R.id.fragment_level__1)
        levelMinusOne.setOnClickListener {
            plan.setImage(ImageSource.resource(R.drawable.your_center_level__1))
        }
    }
}
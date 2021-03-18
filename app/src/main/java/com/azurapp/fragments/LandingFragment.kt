package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.fragment.app.commit
import com.azurapp.R

class LandingFragment : BaseFragment(R.layout.fragment_landing) {

    override fun onBackPressed(): Boolean {
        return false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val yourCenterButton = view.findViewById<CardView>(R.id.fragment_your_center_button)
        val shopsButton = view.findViewById<CardView>(R.id.fragment_shops_button)
        val geantButton = view.findViewById<CardView>(R.id.fragment_geant_button)
        val restaurantButton = view.findViewById<CardView>(R.id.fragment_restaurant_button)
        val leisureButton = view.findViewById<CardView>(R.id.fragment_leisure_button)
        val servicesButton = view.findViewById<CardView>(R.id.fragment_service_button)

        yourCenterButton.setOnClickListener {

            parentFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in_left,
                    R.anim.slide_out_left
                )
                replace(R.id.activity_main_fragment, YourCenterFragment())
                addToBackStack(null)
            }

        }

        shopsButton.setOnClickListener {}

        geantButton.setOnClickListener {}

        restaurantButton.setOnClickListener {}

        leisureButton.setOnClickListener {}

        servicesButton.setOnClickListener {}
    }
}
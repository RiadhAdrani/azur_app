package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.fragment.app.commit
import com.azurapp.R

class MainFragment : BaseFragment(R.layout.fragment_landing) {

    override fun onBackPressed(): Boolean = false

    override fun tag(): String = "MAIN_FRAGMENT"

    private fun pushFragment(
        fragment : BaseFragment,
        enterAnimRes : Int = R.anim.fade_in,
        exitAnimRes : Int = R.anim.fade_out,
        popEnterAnimRes : Int = R.anim.fade_in,
        popExitAnimRes : Int = R.anim.fade_out
    ){
        parentFragmentManager.commit {
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val yourCenterButton = view.findViewById<CardView>(R.id.fragment_your_center_button)
        val shopsButton = view.findViewById<CardView>(R.id.fragment_shops_button)
        val geantButton = view.findViewById<CardView>(R.id.fragment_geant_button)
        val restaurantButton = view.findViewById<CardView>(R.id.fragment_restaurant_button)
        val leisureButton = view.findViewById<CardView>(R.id.fragment_leisure_button)
        val servicesButton = view.findViewById<CardView>(R.id.fragment_service_button)

        yourCenterButton.setOnClickListener {
            pushFragment(YourCenterFragment(), R.anim.slide_left_in, R.anim.slide_left_out)
        }

        shopsButton.setOnClickListener {
            pushFragment(ShopsFragment(), R.anim.slide_up_in, R.anim.slide_up_out)
        }

        geantButton.setOnClickListener {
            pushFragment(GeantFragment(), R.anim.slide_right_in, R.anim.slide_right_out)
        }

        restaurantButton.setOnClickListener {
            pushFragment(RestaurantFragment(), R.anim.slide_left_in, R.anim.slide_left_out)
        }

        leisureButton.setOnClickListener {
            pushFragment(LeisureFragment(), R.anim.slide_down_in, R.anim.slide_down_out)
        }

        servicesButton.setOnClickListener {
            pushFragment(ServicesFragment(), R.anim.slide_right_in, R.anim.slide_right_out)
        }
    }
}
package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.fragment.app.commit
import com.azurapp.R

class MainFragment : BaseFragment(R.layout.fragment_landing) {

    override fun onBackPressed(): Boolean {
        return false
    }

    override fun tag(): String = "MAIN_FRAGMENT"

    private fun replaceFragment(fragment : BaseFragment, enterAnimRes : Int, exitAnimRes : Int){
        parentFragmentManager.commit {
            setCustomAnimations(
                enterAnimRes,
                exitAnimRes
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
            replaceFragment(YourCenterFragment(), R.anim.slide_left_in, R.anim.slide_left_out)
        }

        shopsButton.setOnClickListener {
            replaceFragment(ShopsFragment(), R.anim.slide_up_in, R.anim.slide_up_out)
        }

        geantButton.setOnClickListener {
            replaceFragment(GeantFragment(), R.anim.slide_right_in, R.anim.slide_right_out)
        }

        restaurantButton.setOnClickListener {
            replaceFragment(RestaurantFragment(), R.anim.slide_left_in, R.anim.slide_left_out)
        }

        leisureButton.setOnClickListener {
            replaceFragment(LeisureFragment(), R.anim.fade_in, R.anim.slide_down_out)
        }

        servicesButton.setOnClickListener {
            replaceFragment(ServicesFragment(), R.anim.slide_right_in, R.anim.slide_right_out)
        }
    }
}
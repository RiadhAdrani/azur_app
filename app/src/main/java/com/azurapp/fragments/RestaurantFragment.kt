package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import com.azurapp.R

class RestaurantFragment : BaseFragment(R.layout.fragment_restaurant) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "RESTAURANT_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
    }
}
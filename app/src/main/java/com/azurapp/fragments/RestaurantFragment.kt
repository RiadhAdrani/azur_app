package com.azurapp.fragments

import com.azurapp.R

class RestaurantFragment : BaseFragment(R.layout.fragment_restaurant) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "RESTAURANT_FRAGMENT"
}
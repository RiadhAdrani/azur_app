package com.azurapp.fragments

import com.azurapp.R

class ShopsFragment: BaseFragment(R.layout.fragment_shops) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "SHOPS_FRAGMENT"

}
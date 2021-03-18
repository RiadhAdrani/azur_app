package com.azurapp.fragments

import com.azurapp.R

class LeisureFragment : BaseFragment(R.layout.fragment_leisure) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "LEISURE_FRAGMENT"
}
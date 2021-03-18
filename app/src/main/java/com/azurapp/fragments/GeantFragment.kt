package com.azurapp.fragments

import com.azurapp.R

class GeantFragment : BaseFragment(R.layout.fragment_geant) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "GEANT_FRAGMENT"
}
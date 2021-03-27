package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import com.azurapp.R

class GeantFragment : BaseFragment(R.layout.fragment_geant) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "GEANT_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
    }
}
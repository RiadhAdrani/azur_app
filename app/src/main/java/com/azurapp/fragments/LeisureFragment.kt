package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import com.azurapp.R

class LeisureFragment : BaseFragment(R.layout.fragment_leisure) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "LEISURE_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
    }
}
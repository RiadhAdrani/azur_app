package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import com.azurapp.R

class ServicesFragment: BaseFragment(R.layout.fragment_services) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "SERVICES_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
    }
}
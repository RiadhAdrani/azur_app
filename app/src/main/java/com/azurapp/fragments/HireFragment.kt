package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import com.azurapp.R

class HireFragment: BaseFragment(R.layout.fragment_services) {

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
    }

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "HIRE_FRAGMENT"
}
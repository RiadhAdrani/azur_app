package com.azurapp.fragments

import com.azurapp.R

class ServicesFragment: BaseFragment(R.layout.fragment_services) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "SERVICES_FRAGMENT"
}
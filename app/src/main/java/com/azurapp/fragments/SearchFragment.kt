package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import com.azurapp.R

class SearchFragment : BaseFragment(R.layout.fragment_search) {

    override fun onBackPressed(): Boolean = false

    override fun tag(): String = "SEARCH_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
    }
}
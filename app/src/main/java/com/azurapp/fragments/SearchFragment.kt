package com.azurapp.fragments

import com.azurapp.R

class SearchFragment : BaseFragment(R.layout.fragment_search) {

    override fun onBackPressed(): Boolean = false

    override fun tag(): String = "SEARCH_FRAGMENT"
}
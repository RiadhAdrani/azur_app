package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import com.azurapp.R

class FavoriteFragment : BaseFragment(R.layout.fragment_favorite) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "FAVORITE_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
    }
}
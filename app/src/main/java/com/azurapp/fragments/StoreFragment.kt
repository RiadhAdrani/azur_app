package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import com.azurapp.objects.shop.Store

class StoreFragment(store: Store) : BaseFragment(1)  {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "STORE_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
    }
}
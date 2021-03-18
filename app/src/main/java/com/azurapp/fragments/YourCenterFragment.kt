package com.azurapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import com.azurapp.R

class YourCenterFragment : BaseFragment(R.layout.fragment_your_center) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "YOUR_CENTER_FRAGMENT"
}
package com.azurapp.fragments

import androidx.fragment.app.Fragment

abstract class BaseFragment(layoutRes : Int): Fragment(layoutRes) {

    abstract fun onBackPressed(): Boolean
}
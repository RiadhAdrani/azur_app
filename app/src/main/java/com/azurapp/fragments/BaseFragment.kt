package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.azurapp.R
import com.util.getStatusBarHeight

abstract class BaseFragment(layoutRes : Int): Fragment(layoutRes) {

    abstract fun onBackPressed(): Boolean

    abstract fun tag(): String

    abstract fun onCreated(view: View, savedInstanceState: Bundle?)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onCreated(view, savedInstanceState)
    }

    fun pushFragment(
        fragment : BaseFragment,
        enterAnimRes : Int = R.anim.fade_in,
        exitAnimRes : Int = R.anim.fade_out,
        popEnterAnimRes : Int = R.anim.fade_in,
        popExitAnimRes : Int = R.anim.fade_out
    ){
        parentFragmentManager.commit {
            setCustomAnimations(
                enterAnimRes,
                exitAnimRes,
                popEnterAnimRes,
                popExitAnimRes
            )
            replace(R.id.activity_main_fragment, fragment)
            addToBackStack(fragment.tag())
        }
    }

    fun safePadding(view: View){
        view.updatePadding(top = getStatusBarHeight(this))
    }
}
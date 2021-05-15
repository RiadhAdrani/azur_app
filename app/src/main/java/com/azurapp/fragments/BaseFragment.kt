package com.azurapp.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.azurapp.R
import com.azurapp.objects.store.Store
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
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

    private val fav = "fav"

    fun getFavStores() : ArrayList<String> {
        val shared: SharedPreferences =
            requireActivity().getSharedPreferences(fav, Context.MODE_PRIVATE)
        val gson = Gson()
        val json = shared.getString(fav, null)
        val type = object : TypeToken<ArrayList<String>>() {}.type

        return gson.fromJson(json, type) ?: ArrayList()

    }

    fun isFav(store: Store) = getFavStores().contains(requireContext().getString(store.name))

    fun addFavStore(store: Store){
        val name = requireContext().getString(store.name)
        val currentList = getFavStores()

        if (!currentList.contains(name)){
            currentList.add(name)
        }

        val shared: SharedPreferences =
            requireActivity().getSharedPreferences(fav, Context.MODE_PRIVATE)
        val editor = shared.edit()
        val gson = Gson()
        val json = gson.toJson(currentList)
        editor.putString(fav,json)
        editor.apply()

    }

    fun removeFavStore(store: Store){
        val name = requireContext().getString(store.name)
        val currentList = getFavStores()
        currentList.remove(name)
        val shared: SharedPreferences =
            requireActivity().getSharedPreferences(fav, Context.MODE_PRIVATE)
        val editor = shared.edit()
        val gson = Gson()
        val json = gson.toJson(currentList)
        editor.putString(fav,json)
        editor.apply()
    }
}
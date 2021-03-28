package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.azurapp.objects.shop.ActivitiesAdapter
import com.azurapp.objects.shop.Activity
import com.azurapp.objects.shop.ShopAdapter
import com.util.getLocalStoreList
import com.util.getStatusBarHeight

class ShopsFragment: BaseFragment(R.layout.fragment_shops) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "SHOPS_FRAGMENT"

    var currentCategory : Activity = Activity.All

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        view.updatePadding(top = getStatusBarHeight(this))

        val recyclerView : RecyclerView = view.findViewById(R.id.fragment_shops_recycler_view)
        val adapter = ShopAdapter(getLocalStoreList(), object : ShopAdapter.OnStoreClick{
            override fun onClick(position: Int) {
            }
        })
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context, 2)


        val activitiesList = Activity.values()
        val activitiesRecyclerView : RecyclerView = view.findViewById(R.id.fragment_category_recycler_view)
        activitiesRecyclerView.setHasFixedSize(true)
        val activitiesAdapter = ActivitiesAdapter(activitiesList, object : ActivitiesAdapter.OnActivityClick{
            override fun onClick(position: Int) {
                filterListByActivity(activitiesList[position], adapter)
            }
        })
        activitiesRecyclerView.adapter = activitiesAdapter
        activitiesRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

    fun filterListByActivity(activity: Activity, adapter: ShopAdapter){
        adapter.filter(activity, currentCategory)

        currentCategory = activity
    }

}
package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.azurapp.objects.store.ActivitiesAdapter
import com.azurapp.objects.store.Activity
import com.azurapp.objects.store.Store
import com.azurapp.objects.store.StoreAdapter
import com.util.getLocalStoreList
import com.util.getStatusBarHeight

class StoresFragment: BaseFragment(R.layout.fragment_stores) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "SHOPS_FRAGMENT"

    private var currentCategory : Activity = Activity.all

    override fun onCreated(view: View, savedInstanceState: Bundle?) {
        view.updatePadding(top = getStatusBarHeight(this))

        val storeList = ArrayList<Store>(getLocalStoreList())

        val recyclerView : RecyclerView = view.findViewById(R.id.fragment_shops_recycler_view)

        val adapter = StoreAdapter(requireContext(),storeList, object : StoreAdapter.OnStoreClick{
            override fun onClick(position: Int, list: ArrayList<Store>) {
                pushFragment(StoreFragment(list[position]))
            }
        })

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context, 2)

        val activitiesList = ArrayList<Activity>()

        for (e: Store in storeList){
            for (a : Activity in e.activity){
                if (a !in activitiesList){
                    activitiesList.add(a)
                }
            }
        }

        activitiesList.add(0, Activity.all)

        val activitiesRecyclerView : RecyclerView = view.findViewById(R.id.fragment_category_recycler_view)
        activitiesRecyclerView.setHasFixedSize(true)
        val activitiesAdapter = ActivitiesAdapter(requireContext(), activitiesList, object : ActivitiesAdapter.OnActivityClick{
            override fun onClick(position: Int) {
                filterListByActivity(activitiesList[position], adapter)
            }
        })
        activitiesRecyclerView.adapter = activitiesAdapter
        activitiesRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

    fun filterListByActivity(activity: Activity, adapter: StoreAdapter){
        adapter.filter(activity, currentCategory)
        currentCategory = activity
    }

}
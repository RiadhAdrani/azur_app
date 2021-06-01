package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.azurapp.objects.store.Store
import com.azurapp.objects.store.StoreAdapter
import com.azurapp.objects.store.StoreServiceAdapter
import com.util.getLocalServicesList
import com.util.getStatusBarHeight
import com.util.sortStoreList

class ServicesFragment: BaseFragment(R.layout.fragment_services) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "SERVICES_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        view.updatePadding(top = getStatusBarHeight(this))

        val adapter = StoreServiceAdapter(sortStoreList(getLocalServicesList(),requireContext()),requireContext(), object : StoreAdapter.OnStoreClick{
            override fun onClick(position: Int, list: ArrayList<Store>) {
                pushFragment(StoreFragment(list[position]))
            }
        })

        val recyclerView : RecyclerView = view.findViewById(R.id.fragment_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = adapter

    }
}
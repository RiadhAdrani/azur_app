package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.azurapp.objects.shop.ShopAdapter
import com.util.getLocalStoreList

class ShopsFragment: BaseFragment(R.layout.fragment_shops) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "SHOPS_FRAGMENT"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView : RecyclerView = view.findViewById(R.id.fragment_shops_recycler_view)
        val adapter = ShopAdapter(getLocalStoreList())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.setHasFixedSize(true)
    }
}
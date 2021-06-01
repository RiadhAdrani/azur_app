package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.azurapp.objects.store.Store
import com.azurapp.objects.store.StoreAdapter
import com.azurapp.objects.store.StoreFavAdapter
import com.azurapp.objects.store.StoreLeisureAdapter
import com.util.getAllLocalStores
import com.util.getLocalLeisureList
import com.util.sortStoreList

class FavoriteFragment : BaseFragment(R.layout.fragment_favorite) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "FAVORITE_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        safePadding(view)

        val list = ArrayList<Store>()
        for (store : Store in getAllLocalStores()){
            if (getFavStores().contains(getString(store.name))){
                list.add(store)
            }
        }

        val adapter = StoreFavAdapter(sortStoreList(list,requireContext()),requireContext(),onClick())

        val recyclerView : RecyclerView = view.findViewById(R.id.fragment_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = adapter

    }

    fun onClick() : StoreFavAdapter.OnClick{
        return object : StoreFavAdapter.OnClick{
            override fun onStoreClick(position: Int, list: ArrayList<Store>) {
                pushFragment(StoreFragment(list[position]))
            }

            override fun onFavClick(position: Int, list: ArrayList<Store>, adapter: StoreFavAdapter) {
                removeFavStore(list[position])
                list.removeAt(position)
                adapter.notifyItemRemoved(position)
            }
        }
    }
}
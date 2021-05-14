package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.core.widget.doOnTextChanged
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.azurapp.objects.store.Store
import com.azurapp.objects.store.StoreAdapter
import com.azurapp.objects.store.StoreAdapter2
import com.util.getAllLocalStores
import com.util.getStatusBarHeight

class SearchFragment : BaseFragment(R.layout.fragment_search) {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "SEARCH_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = StoreAdapter2(
            getAllLocalStores(),
            requireContext(),
            object : StoreAdapter.OnStoreClick {
                override fun onClick(position: Int, list: ArrayList<Store>) {
                    pushFragment(StoreFragment(list[position]))
                }
            })

        val recyclerView: RecyclerView = view.findViewById(R.id.fragment_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL, false
        )
        recyclerView.adapter = adapter

        val searchField: EditText = view.findViewById(R.id.fragment_toolbar)
        searchField.setPadding(
            searchField.paddingLeft,
            searchField.paddingTop + getStatusBarHeight(this),
            searchField.paddingRight,
            searchField.paddingBottom
        )
        searchField.doOnTextChanged { text, _, _, _ ->
            adapter.filter(text, requireContext())
        }

    }
}
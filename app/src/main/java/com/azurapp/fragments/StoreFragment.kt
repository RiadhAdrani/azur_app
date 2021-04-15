package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.azurapp.R
import com.azurapp.objects.shop.Store

class StoreFragment(private val store: Store) : BaseFragment(R.layout.fragment_store)  {

    override fun onBackPressed(): Boolean = true

    override fun tag(): String = "STORE_FRAGMENT"

    override fun onCreated(view: View, savedInstanceState: Bundle?) {

        val title : TextView = view.findViewById(R.id.fragment_store_name)
        title.text = requireContext().getText(store.name)

        val id : TextView = view.findViewById(R.id.fragment_id_label)
        id.text = "${store.mapID}"

        val floor : TextView = view.findViewById(R.id.fragment_floor_label)
        floor.text = requireContext().getString(store.level.name)

        val activity : TextView = view.findViewById(R.id.fragment_activity_label)
        activity.text = requireContext().getString(store.activity[0].name)

        val facebook : TextView = view.findViewById(R.id.fragment_facebook_label)
        facebook.text = requireContext().getString(store.links[0].link)

        val phone : TextView = view.findViewById(R.id.fragment_phone_label)
        phone.text = requireContext().getString(store.phone)

        val web : TextView = view.findViewById(R.id.fragment_web_label)
        web.text = requireContext().getString(store.links[1].link)

        val description : TextView = view.findViewById(R.id.fragment_description)
        description.text = requireContext().getString(store.description)

        val banner : ImageView = view.findViewById(R.id.fragment_banner)
        banner.setImageResource(store.icon)

    }
}
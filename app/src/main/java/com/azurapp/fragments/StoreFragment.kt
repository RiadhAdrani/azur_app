package com.azurapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.azurapp.R
import com.azurapp.objects.store.Store

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
        if (requireContext().getString(store.links[0].link).trim().isEmpty()){
            view.findViewById<LinearLayout>(R.id.fragment_facebook_wrapper).visibility = View.GONE
        } else {
            facebook.text = requireContext().getString(store.links[0].link)
        }

        val phone : TextView = view.findViewById(R.id.fragment_phone_label)
        if (requireContext().getString(store.phone).trim().isEmpty()){
            view.findViewById<LinearLayout>(R.id.fragment_phone_wrapper).visibility = View.GONE
        }
        else {
            phone.text = requireContext().getString(store.phone)
        }

        val web : TextView = view.findViewById(R.id.fragment_web_label)
        if (requireContext().getString(store.links[1].link).trim().isEmpty()){
            view.findViewById<LinearLayout>(R.id.fragment_website_wrapper).visibility = View.GONE
        } else {
            web.text = requireContext().getString(store.links[1].link)
        }

        val description: TextView = view.findViewById(R.id.fragment_description)
        description.text = requireContext().getString(store.description)

        val banner: ImageView = view.findViewById(R.id.fragment_banner)
        banner.setImageResource(store.icon)

        val fav: ImageView = view.findViewById(R.id.fragment_fav)
        fav.setImageResource(if (isFav(store)) R.drawable.ic_fav_on else R.drawable.ic_fav_off)
        fav.setOnClickListener {
            if (isFav(store)) removeFavStore(store) else addFavStore(store)
            fav.setImageResource(if (isFav(store)) R.drawable.ic_fav_on else R.drawable.ic_fav_off)
        }

    }
}
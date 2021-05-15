package com.azurapp.objects.store

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import java.util.*
import kotlin.collections.ArrayList

class StoreFavAdapter(
    private val list: ArrayList<Store>,
    private val context: Context,
    private val onClick: OnClick
) : RecyclerView.Adapter<StoreFavAdapter.StoreHolder>() {

    interface OnClick{
        fun onStoreClick(position: Int, list: ArrayList<Store>)
        fun onFavClick(position: Int, list: ArrayList<Store>, adapter: StoreFavAdapter)
    }

    inner class StoreHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val logo: ImageView = itemView.findViewById(R.id.item_icon)
        private val name: TextView = itemView.findViewById(R.id.item_name)
        private val fav : ImageView = itemView.findViewById(R.id.item_fav)

        fun bind(store: Store) {
            logo.setImageResource(store.icon)
            name.text = context.getText(store.name)
            fav.setOnClickListener {
                onClick.onFavClick(adapterPosition, list, this@StoreFavAdapter)
            }
            itemView.setOnClickListener {
                onClick.onStoreClick(adapterPosition, list)
            }

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StoreHolder {
        return StoreHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_store_fav, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StoreHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
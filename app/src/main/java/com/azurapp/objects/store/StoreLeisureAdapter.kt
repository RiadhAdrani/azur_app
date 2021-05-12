package com.azurapp.objects.store

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R

class StoreLeisureAdapter(
    private val list: ArrayList<Store>,
    private val context: Context,
    private val onClick: StoreAdapter.OnStoreClick
) : RecyclerView.Adapter<StoreLeisureAdapter.StoreHolder>() {

    inner class StoreHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val logo: ImageView = itemView.findViewById(R.id.item_icon)
        private val name: TextView = itemView.findViewById(R.id.item_name)
        private val description: TextView = itemView.findViewById(R.id.item_description)

        fun bind(store: Store) {
            logo.setImageResource(store.icon)
            name.text = context.getText(store.name)
            description.text = context.getText(store.description)

            itemView.setOnClickListener {
                onClick.onClick(adapterPosition, list)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StoreHolder {
        return StoreHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_store_leisure, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StoreHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
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

class StoreAdapter2(
    private val list: ArrayList<Store>,
    private val context: Context,
    private val onClick: StoreAdapter.OnStoreClick
) : RecyclerView.Adapter<StoreAdapter2.StoreHolder>() {

    var listToDisplay = ArrayList<Store>(list)

    inner class StoreHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val logo: ImageView = itemView.findViewById(R.id.item_icon)
        private val name: TextView = itemView.findViewById(R.id.item_name)

        fun bind(store: Store) {
            logo.setImageResource(store.icon)
            name.text = context.getText(store.name)
            itemView.setOnClickListener {
                onClick.onClick(adapterPosition, list)
            }
        }
    }

    fun filter(text: CharSequence?, context: Context) {

        if (text == null)
            return

        if (text.isEmpty()) {
            listToDisplay = ArrayList(list)
            notifyDataSetChanged()
        } else {
            listToDisplay.clear()
            for (store: Store in list) {
                if (context.getText(store.name).toString().toLowerCase(Locale.ROOT).contains(
                        text.toString().toLowerCase(
                            Locale.ROOT
                        )
                    )
                ) {
                    listToDisplay.add(0, store)
                    notifyItemInserted(0)
                }
            }
            notifyDataSetChanged()
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StoreHolder {
        return StoreHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_store_2, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StoreHolder, position: Int) {
        holder.bind(listToDisplay[position])
    }

    override fun getItemCount(): Int = listToDisplay.size
}
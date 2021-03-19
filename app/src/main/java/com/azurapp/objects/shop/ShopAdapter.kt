package com.azurapp.objects.shop

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.util.activityToString
import com.util.levelToString

class ShopAdapter(private val list : ArrayList<Shop>) : RecyclerView.Adapter<ShopAdapter.ShopHolder>() {


    inner class ShopHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val storeLogo: ImageView = itemView.findViewById(R.id.item_store_logo)
        private val storeName: TextView = itemView.findViewById(R.id.item_store_name)
        private val storeCategory: TextView = itemView.findViewById(R.id.item_store_category_label)
        private val storeLevel: TextView = itemView.findViewById(R.id.item_store_level_label)

        init {
            itemView.setOnClickListener {
                if (adapterPosition != RecyclerView.NO_POSITION) {
                    Log.d("azur","go to store fragment")
                }
            }
        }

        fun bindData(shop: Shop){
            storeLogo.setImageResource(shop.icon)
            storeName.text = shop.name
            storeCategory.text = activityToString(shop.activity)
            storeLevel.text = levelToString(shop.level)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopHolder {
        return ShopHolder(
            LayoutInflater.from(parent.context).
            inflate(R.layout.item_shop,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ShopHolder, position: Int) {
        holder.bindData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
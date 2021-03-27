package com.azurapp.objects.shop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.util.activityToString
import com.util.levelToString

class ShopAdapter(private val list : ArrayList<Shop>, private val onClick : OnStoreClick) : RecyclerView.Adapter<ShopAdapter.ShopHolder>() {

    private var listToDisplay : ArrayList<Shop> = list

    interface OnStoreClick{
        fun onClick(position: Int)
    }

    inner class ShopHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val storeLogo: ImageView = itemView.findViewById(R.id.item_store_logo)
        private val storeName: TextView = itemView.findViewById(R.id.item_store_name)
        private val storeCategory: TextView = itemView.findViewById(R.id.item_store_category_label)
        private val storeLevel: TextView = itemView.findViewById(R.id.item_store_level_label)

        fun bindData(shop: Shop){
            storeLogo.setImageResource(shop.icon)
            storeName.text = shop.name
            storeCategory.text = activityToString(shop.activity)
            storeLevel.text = levelToString(shop.level)

            itemView.setOnClickListener {
                onClick.onClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopHolder {
        return ShopHolder(
            LayoutInflater.from(parent.context).
            inflate(R.layout.item_shop,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ShopHolder, position: Int) {
        holder.bindData(listToDisplay[position])
    }

    override fun getItemCount(): Int {
        return listToDisplay.size
    }

    fun filter(activity: Activity, oldActivity: Activity){

        if (activity == oldActivity)
            return

        if (activity == Activity.All){
            listToDisplay = list
            notifyDataSetChanged()
        } else{
            listToDisplay.clear()
            for (shop : Shop in list){
                if (shop.activity == activity){
                    listToDisplay.add(shop)
                }
            }
            notifyDataSetChanged()
        }

    }
}
package com.azurapp.objects.shop

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R

class StoreAdapter(
    private val context: Context,
    private val list : ArrayList<Store>,
    private val onClick : OnStoreClick) : RecyclerView.Adapter<StoreAdapter.ShopHolder>() {

    var listToDisplay : ArrayList<Store>

    init {
        listToDisplay = ArrayList()
        for (item : Store in list){
            listToDisplay.add(item)
        }
    }

    interface OnStoreClick{
        fun onClick(position: Int, list: ArrayList<Store>)
    }

    inner class ShopHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val storeLogo: ImageView = itemView.findViewById(R.id.item_store_logo)
        private val storeName: TextView = itemView.findViewById(R.id.item_store_name)
        private val storeCategory: TextView = itemView.findViewById(R.id.item_store_category_label)
        private val storeLevel: TextView = itemView.findViewById(R.id.item_store_level_label)

        fun bindData(store: Store){
            storeLogo.setImageResource(store.icon)
            storeName.text = context.getString(store.name)
            storeCategory.text = context.getString(store.activity[0].name)
            storeLevel.text = context.getString(store.level.name)

            itemView.setOnClickListener {
                onClick.onClick(adapterPosition, listToDisplay)
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

        if (activity.id == oldActivity.id)
            return

        if (activity.id == 0){
            listToDisplay = ArrayList(list)
            notifyDataSetChanged()
        } else{
            listToDisplay.clear()
            for (store : Store in list){
                if (activity in store.activity){
                    listToDisplay.add(0,store)
                    notifyItemInserted(0)
                }
            }
            notifyDataSetChanged()
        }

    }
}
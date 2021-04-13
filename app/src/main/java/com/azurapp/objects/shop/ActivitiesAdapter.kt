package com.azurapp.objects.shop

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azurapp.R
import com.util.activityImage


class ActivitiesAdapter(
    private val context: Context,
    private val list : ArrayList<Activity>,
    private val onClick : OnActivityClick): RecyclerView.Adapter<ActivitiesAdapter.Holder>() {

    interface OnActivityClick{
        fun onClick(position: Int)
    }

    inner class Holder(itemView : View): RecyclerView.ViewHolder(itemView) {

        private val background : ImageView = itemView.findViewById(R.id.item_background)
        private val text : TextView = itemView.findViewById(R.id.item_text)

        fun bind(activity : Activity){

            background.setBackgroundResource(activityImage())

            // background.drawable.setColorFilter(0x76ffffff, PorterDuff.Mode.MULTIPLY )

            text.text = context.getString(activity.name)

            itemView.setOnClickListener {
                onClick.onClick(adapterPosition)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder
    = Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_activity,parent,false))

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
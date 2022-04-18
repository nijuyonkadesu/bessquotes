package com.njk.bessquotes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.njk.bessquotes.R
import com.njk.bessquotes.model.Quote

class ItemAdapter(private val context: Context, private val dataset: List<Quote>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() { // extend

    // 1 invoked by layout manager
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder { // inflate layout from xml - and pass it to ItemViewHolder -> RecycleView.ViewHolder
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false) // LayoutInflater needs to get a handle of the activity [which it gets from 'from()'] | parent -> RecyclerView | context -> MainActivity
        return ItemViewHolder(adapterLayout)
    }
    // 2 invoked by layout manager - replace contents of view
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
    // 3 invoked by layout manager
    override fun getItemCount() = dataset.size

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) { // subclass
        val textView: TextView = view.findViewById(R.id.item_title) // reference to the views within a list item layout + this is caching
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }
}
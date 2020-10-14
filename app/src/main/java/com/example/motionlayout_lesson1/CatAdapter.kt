package com.example.motionlayout_lesson1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class CatAdapter : ListAdapter<String, CatAdapter.ViewHolder>(
    object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(p0: String, p1: String) = p0 == p1
        override fun areContentsTheSame(p0: String, p1: String) = p0 == p1
    }
) {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: String) {
            itemView.findViewById<TextView>(R.id.textView).text = item
        }
    }

    override fun onCreateViewHolder(viewHolder: ViewGroup, position: Int) = ViewHolder(
        LayoutInflater.from(viewHolder.context).inflate(R.layout.listitem_card, viewHolder, false)
    )
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(getItem(position))
    }
}
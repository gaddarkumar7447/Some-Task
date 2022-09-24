package com.example.recyclerviewadapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.internal.artificialFrame

class AdaterClass(val list: List<String>, val list2: List<String>) : RecyclerView.Adapter<AdaterClass.MyViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.back, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = list[position]
        holder.dec1.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val dec1 : TextView = itemView.findViewById(R.id.decription)
        val title : TextView = itemView.findViewById(R.id.textView)

    }
}
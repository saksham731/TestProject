package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.FirstRecyclerviewAdapter.FirstRecyclerviewViewHolder

class FirstRecyclerviewAdapter(data: List<Model>) : RecyclerView.Adapter<FirstRecyclerviewViewHolder>() {
    private val data: Array<String>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstRecyclerviewViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_firstrecyclerview, parent, false)
        return FirstRecyclerviewViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstRecyclerviewViewHolder, position: Int) {
        val number = data[position]
        holder.txtView.text = number
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class FirstRecyclerviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtView: TextView

        init {
            txtView = itemView.findViewById<View>(R.id.NumberText) as TextView
        }
    }

    init {
        this.data = data
    }
}
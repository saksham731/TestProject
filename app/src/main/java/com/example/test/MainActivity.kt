package com.example.test

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var adapter: RecyclerView.Adapter<*>? = null
    var listItem: List<ListItem>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<View>(R.id.programminglist) as RecyclerView
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        listItem = ArrayList<Any>()
        for (i in 1..5) {
            val listItem: listItem = ListItem(
                    "1",
                    "2",
                    "3",
                    "4",
                    "5"
            )
        }
        listItem.add(listItem)
        adapter = FirstRecyclerviewAdapter(listItem, this)
        recyclerView!!.adapter = adapter
    }
}
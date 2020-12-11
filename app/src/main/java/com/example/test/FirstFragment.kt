package com.example.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class FirstFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var itemList: MutableList<Model>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        recyclerView = view.findViewById(R.id.programminglist)
        recyclerView.setHasFixedSize(true)
        recyclerView.setLayoutManager(LinearLayoutManager(context))

        //initData();
        recyclerView.setAdapter(FirstRecyclerviewAdapter(initData()))
        return view
    }

    private fun initData(): List<Model> {
        itemList = ArrayList()
        itemList.add(Model("1"))
        itemList.add(Model("2"))
        itemList.add(Model("3"))
        itemList.add(Model("4"))
        itemList.add(Model("5"))
        return itemList
    }
}
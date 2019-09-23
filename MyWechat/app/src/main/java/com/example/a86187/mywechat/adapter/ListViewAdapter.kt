package com.example.a86187.mywechat.adapter


import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.a86187.mywechat.R
import java.util.*

class ListViewAdapter(val list: ArrayList<String>, val context: Context) : BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var holder: TestViewHolder
        var v: View
        if (convertView == null) {
            v = View.inflate(context, R.layout.item_chat, null)
            holder = TestViewHolder(v)
            v.tag = holder
        } else {
            v = convertView
            holder = v.tag as TestViewHolder
        }
        holder.str.text = list[position]
        return v
    }

    override fun getItem(position: Int): Any? {
        return list.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}

class TestViewHolder(var viewItem: View) {
    var str: TextView = viewItem.findViewById(R.id.str) as TextView
}
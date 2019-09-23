package com.example.a86187.mywechat

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle
import android.widget.ListAdapter
import com.example.a86187.mywechat.adapter.ListViewAdapter
import kotlinx.android.synthetic.main.activity_chat.*

import java.util.*

class ChatActivity: AppCompatActivity(){

    private var itemList=ArrayList<String>()
    private var adapter : ListViewAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        itemList.getData()
        adapter = ListViewAdapter(itemList,this)
        listView.adapter = adapter

    }
    fun ArrayList<String>.getData(){
        for(i in 0..20){
            this.add("朋友"+i)
        }
    }
}

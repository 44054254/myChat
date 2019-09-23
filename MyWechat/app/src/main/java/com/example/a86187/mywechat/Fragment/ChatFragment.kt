package com.example.a86187.mywechat.Fragment
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.ListFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a86187.mywechat.R
import com.example.a86187.mywechat.logonActivity
import kotlinx.android.synthetic.main.fragment_me.*
import android.widget.ArrayAdapter



/**
 * Created by Sin on 2019/1/10
 */
class ChatFragment: Fragment() {

    //private val data = arrayOf("Apple1", "Apple2", "Apple3", "Apple4", "Apple5", "Apple6", "Apple7", "Apple8", "Apple9", "Apple10", "Apple11", "Apple12", "Apple13", "Apple14", "Apple15", "Apple16", "Apple17", "Apple18", "Apple19", "Apple20")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fmview : View = inflater.inflate(R.layout.fragment_chat,container,false)
        return fmview
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = arrayOf("my gardon", "sell%buy", "friends", "baike")

    }
}



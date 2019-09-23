package com.example.a86187.mywechat.Fragment
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a86187.mywechat.R

/**
 * Created by Sin on 2019/1/10
 */
class FindFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fmview : View = inflater.inflate(R.layout.fragment_find,container,false)
        return fmview
    }
}
package com.example.a86187.mywechat.Fragment
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a86187.mywechat.R

class FriendFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fmview: View = inflater.inflate(R.layout.fragment_friend, container, false)
        return fmview
    }

}


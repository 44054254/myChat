package com.example.a86187.mywechat.Fragment
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a86187.mywechat.R
import com.example.a86187.mywechat.logonActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_me.*

class MeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fmview: View = inflater.inflate(R.layout.fragment_me, container, false)
        return fmview
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logoffbtn.setOnClickListener{
            val intent = Intent(activity, logonActivity::class.java)
            startActivity(intent);
        }
    }

}
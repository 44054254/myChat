package com.example.a86187.mywechat

import android.content.Intent
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import com.example.a86187.mywechat.Fragment.ChatFragment
import com.example.a86187.mywechat.Fragment.FriendFragment
import com.example.a86187.mywechat.Fragment.FindFragment
import com.example.a86187.mywechat.Fragment.MeFragment
import com.example.a86187.mywechat.adapter.TitleFragmentPagesAdapter
import kotlinx.android.synthetic.main.fragment_chat.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_me.*


class MainActivity : AppCompatActivity(), TabLayout.OnTabSelectedListener {
    override fun onTabReselected(p0: TabLayout.Tab?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        vp_content.currentItem = p0!!.position

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
        setTab()
        setItem()
        vp_content.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tl_table))
//        button.setOnClickListener {
//            startActivity(Intent(this, chatActivity::class.java))
//        }

    }

    //初始化界面
    private fun initView() {
        setContentView(R.layout.activity_main)
    }

    //设置Tab
    private fun setTab() {
        val tab1: ChatFragment = ChatFragment()
        val tab2: FriendFragment = FriendFragment()
        val tab3: FindFragment = FindFragment()
        val tab4: MeFragment = MeFragment()
        var list = listOf<Fragment>(tab1, tab2, tab3,tab4)

        vp_content.adapter = TitleFragmentPagesAdapter(list, supportFragmentManager)
        tl_table.setupWithViewPager(vp_content)

    }

    //设置条目
    fun setItem() {
        tl_table.setTabMode(TabLayout.MODE_FIXED);
        tl_table.getTabAt(0)?.setText("微信")?.setIcon(R.drawable.tab_main_msg_selector);
        tl_table.getTabAt(1)?.setText("通讯录")?.setIcon(R.drawable.tab_main_contact_selector);
        tl_table.getTabAt(2)?.setText("发现")?.setIcon(R.drawable.tab_main_find_selector);
        tl_table.getTabAt(3)?.setText("我")?.setIcon(R.drawable.tab_main_me_selector);
    }
}

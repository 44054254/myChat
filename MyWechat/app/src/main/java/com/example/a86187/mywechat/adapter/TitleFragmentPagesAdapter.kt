package com.example.a86187.mywechat.adapter
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by Sin on 2019/1/10
 */
class TitleFragmentPagesAdapter(var fmList: List<Fragment>, fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {

    override fun getItem(p0: Int) = fmList[p0]

    override fun getCount() = fmList.size

}
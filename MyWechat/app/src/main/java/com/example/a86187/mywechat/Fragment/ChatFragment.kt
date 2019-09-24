package com.example.a86187.mywechat.Fragment

import com.example.a86187.mywechat.R.id.textView1
import android.widget.TextView
import com.example.a86187.mywechat.R.layout.item
import android.view.LayoutInflater
import android.view.ViewGroup
import java.nio.file.Files.size
import android.widget.BaseAdapter
import android.widget.Toast
import android.os.Bundle
import android.support.v4.app.ListFragment
import android.view.View
import android.widget.ListView
import com.example.a86187.mywechat.R


class ChatFragment : ListFragment() {

    /* 定义适配器 */
    private var adapter: MyAdapter? = null

    /* 创建数据源 */
    val data: List<String>
        get() {

            val list = ArrayList<String>()
            for (i in 0..15) {
                list.add("朋友" + i)
            }

            return list
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*创建adapter*/
        adapter = MyAdapter()
        /*为adapter绑定数据*/
        adapter!!.bindData(data)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        /* 动态加载布局 */
        val view = inflater.inflate(R.layout.fragment_chat, null)

        /*设置适配器*/
        this.setListAdapter(adapter)

        return view
    }

    override fun onPause() {
        // TODO Auto-generated method stub
        super.onPause()
    }

    /**
     * ListFragment提供了一个方便的方法onListItemClick
     */
    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        val item = adapter!!.getItem(position).toString()
        Toast.makeText(getActivity(), "-->>" + item, 1).show()
    }

    /**
     * 自定义适配器
     *
     * @author Liao
     */
    internal inner class MyAdapter : BaseAdapter() {

        /* 数据集合 */
        private var list: List<String>? = null

        /**
         * 绑定数据
         *
         * @param list
         */
        fun bindData(list: List<String>) {
            this.list = list
        }

        override fun getCount(): Int {

            return list!!.size
        }

        override fun getItem(position: Int): Any {

            return list!![position]
        }

        override fun getItemId(position: Int): Long {

            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

            var view: View? = null
            if (convertView == null) {
                view = LayoutInflater.from(getActivity()).inflate(R.layout.item, null)

            } else {
                view = convertView
            }

            /* 从动态布局中获取控件 */
            val textView = view!!.findViewById(R.id.textView1) as TextView
            /* 设置TextView的值 */
            textView.text = list!![position]

            return view
        }
    }
}
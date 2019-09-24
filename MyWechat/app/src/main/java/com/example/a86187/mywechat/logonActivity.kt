package com.example.a86187.mywechat

import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logon.*
import android.R.id.edit
import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.content.Intent
import android.R.id.edit
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.a86187.mywechat.R.id.message
import java.io.File
import java.io.OutputStream
import android.R.attr.path
import android.view.View


class logonActivity : AppCompatActivity() {
    var userName =""
    var psw =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logon)
        //读取用户名
        val sp = this.getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        val username = sp.getString("USERNAME", "")
        et_user_name.setText(username);

        btn_login.setOnClickListener {
            userName = et_user_name.text.toString().trim()
            psw = et_psw.text.toString().trim()
            if(TextUtils.isEmpty(userName)){
                Toast.makeText(this,"请输入你的用户名",Toast.LENGTH_SHORT).show()
            }else if(TextUtils.isEmpty(psw)){
                Toast.makeText(this,"请输入你的密码",Toast.LENGTH_SHORT).show()
            }else{
                //存储用户名
                val editor = sp.edit()
                editor.putString("USERNAME", userName);
                editor.commit();

                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
                this.finish();
                startActivity(Intent(this, MainActivity::class.java))
            }

        }
    }

    fun saveImage(path: String, bitmap: Bitmap) {
        try {
            val file = File(path)
            //outputStream获取文件的输出流对象
            val fos: OutputStream = file.outputStream()
            //压缩格式为JPEG图像，压缩质量为80%
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fos)
            fos.flush()
            fos.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


}

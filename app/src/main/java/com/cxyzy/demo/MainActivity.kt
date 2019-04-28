package com.cxyzy.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sunfusheng.marqueeview.MarqueeView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messages = ArrayList<String>()
        messages.add("《赋得古原草送别》")
        messages.add("离离原上草，一岁一枯荣。")
        messages.add("野火烧不尽，春风吹又生。")
        marqueeView.setFlipInterval(1000)
        marqueeView.startWithList(messages)
    }
}

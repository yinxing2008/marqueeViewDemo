package com.cxyzy.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sunfusheng.marqueeview.MarqueeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messages = mutableListOf<String>()
        messages.add("《赋得古原草送别》")
        messages.add("离离原上草，一岁一枯荣。")
        messages.add("野火烧不尽，春风吹又生。")
        val marqueeView = findViewById<MarqueeView<String>>(R.id.marqueeView)
        marqueeView.setFlipInterval(1000)
        marqueeView.startWithList(messages)
    }
}

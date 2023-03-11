package com.example.qrscanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager

import com.example.qrscanner.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var viewpager: ViewPager
    lateinit var tabs: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager = findViewById(R.id.viewpager)
        tabs = findViewById(R.id.tabs)


        viewpager.adapter = PagerAdapter(supportFragmentManager)
        tabs.setupWithViewPager(viewpager)
    }

}
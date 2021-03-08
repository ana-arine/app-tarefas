package com.ctt.minhastarefas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var myLocationListener: MyLocationListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // title = "MinhasTarefasApp"
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        tabLayout.addTab(tabLayout.newTab().setText("Afazeres"))
        tabLayout.addTab(tabLayout.newTab().setText("Progresso"))
        tabLayout.addTab(tabLayout.newTab().setText("Feitas"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = FragmentAdapter(this, supportFragmentManager,
            tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
}

//SANDYARA -    whatsapp
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        //1. VINCULAMOS AS FRAGMENTS A VIEWPAGER
//        //2. VINCULAMOS A VIEWPAGER AO TABLAYOUT
//
//        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
//        val viewPager = findViewById<ViewPager>(R.id.viewPager)
//
//        viewPager.adapter = PageAdapter(supportFragmentManager)
//        tabLayout.setupWithViewPager(viewPager)
//
//    }
//}


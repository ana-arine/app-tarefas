package com.ctt.minhastarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  supportActionBar?.hide()

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        tabLayout.addTab(tabLayout.newTab().setText("Afazeres"))
        tabLayout.addTab(tabLayout.newTab().setText("Progresso"))
        tabLayout.addTab(tabLayout.newTab().setText("Feitas"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = ViewPagerAdapter(this, supportFragmentManager,
            tabLayout.tabCount)

        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.setupWithViewPager(viewPager)  //material.io

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
                // Handle tab unselect
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {
                // Handle tab unselect
            }
            override fun onTabReselected(tab: TabLayout.Tab) {
                // Handle tab unselect
            }
        })
    }
}

    //--------------------------------------------------------------------------------

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


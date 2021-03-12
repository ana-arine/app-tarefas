package com.ctt.minhastarefas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.ctt.minhastarefas.adapter.TarefasAdapter
import com.ctt.minhastarefas.model.Tarefa
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

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

        val adapter = FragmentAdapter(this, supportFragmentManager,
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


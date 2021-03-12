package com.ctt.minhastarefas

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ctt.minhastarefas.fragments.EmProgressoFragment
import com.ctt.minhastarefas.fragments.FazerFragment
import com.ctt.minhastarefas.fragments.FeitasFragment

@Suppress("DEPRECATION")

class ViewPagerAdapter(
        var context: Context,
        fm: FragmentManager,
        var totalTabs: Int) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {

            0 -> FazerFragment()
            1 -> EmProgressoFragment()
            2 -> FeitasFragment()
            else -> getItem(position)
        }
    }
}



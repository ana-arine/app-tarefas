package com.ctt.minhastarefas

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){

            0 -> AFazerFragment()
            1 -> EmProgressoFragment()
            2 -> FeitasFragment()
            else -> getItem(position)
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Fazer"
            1 -> "Progresso"
            2 -> "Feitas"
            else -> getPageTitle(position)
        }
    }
}

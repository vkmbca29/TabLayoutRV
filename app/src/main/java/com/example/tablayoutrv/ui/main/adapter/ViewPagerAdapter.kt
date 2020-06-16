package com.example.tablayoutrv.ui.main.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(private val context: Context,private val fm: FragmentManager) : FragmentPagerAdapter(fm){
    private var fragmentList  = ArrayList<Fragment>()
    private var fragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }
    fun addFragment(fragment: Fragment,title:String){
        fragmentList.add(fragment)
        fragmentTitleList.add(title)

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList.get(position)
    }

}
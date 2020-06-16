package com.example.tablayoutrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.tablayoutrv.databinding.ActivityMainBinding
import com.example.tablayoutrv.ui.main.adapter.ViewPagerAdapter
import com.example.tablayoutrv.ui.main.fragment.FragmentOne
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabview:TabLayout
    lateinit var toolbar: Toolbar
    lateinit var viewPager :ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
         val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setupViewPager(binding.viewPager)
        binding.tablayout.setupWithViewPager(viewPager)


    }

    private fun setupViewPager(viewPager: ViewPager?) {
        val adapter = ViewPagerAdapter(applicationContext,supportFragmentManager)

        adapter.addFragment(FragmentOne(), "ONE")
        adapter.addFragment(FragmentOne(), "TWO")
        adapter.addFragment(FragmentOne(), "THREE")
        viewPager?.adapter = adapter
    }
}

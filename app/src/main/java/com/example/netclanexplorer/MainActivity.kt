package com.example.netclanexplorer

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize TabLayout and ViewPager
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        val adapter = TabPagerAdapter(supportFragmentManager)

        // Add your fragments
        adapter.addFragment(Personal(), "Personal")
        adapter.addFragment(Business(), "Business")
        adapter.addFragment(Merchant(), "Merchant")

        // Set the adapter to the ViewPager
        viewPager.adapter = adapter

        // Connect the TabLayout and ViewPager
        tabLayout.setupWithViewPager(viewPager)



        val refine = findViewById<LinearLayout>(R.id.refinebutton)
        refine.setOnClickListener {
            val intent = Intent(this, RefineActivity::class.java)
            startActivity(intent)
        }

    }
}

class TabPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList[position]
    }
}

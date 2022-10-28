package com.example.timetable_vlsu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.timetable_vlsu.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
//        val btn1 = findViewById<Button>(R.id.btn1) as Button
//
//        btn1.setOnClickListener{
//            val intent = Intent(this@MainActivity,NavBottom::class.java)
//        }

    }

    private fun initial() {
        binding.viewPager.adapter = ViewPagerAdapter(this)
        binding.tabLayout.tabIconTint=null
        TabLayoutMediator(binding.tabLayout,binding.viewPager){
            tab, pos ->
            when(pos){
                0 ->{
                    tab.setText("Бакалавриат")
                }
                1 ->{
                    tab.setText("Специалитет")
                }
                2 ->{
                    tab.setText("Магитсратура")
                }
            }
        }.attach()
    }

}
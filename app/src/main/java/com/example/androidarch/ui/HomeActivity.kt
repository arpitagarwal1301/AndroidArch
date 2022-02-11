package com.example.androidarch.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidarch.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var homeViewModel: HomeViewModel
    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.labelTv.text = "Hello world"
        binding.labelTv.setOnClickListener { homeViewModel.getPosts() }
        initView()
    }

    private fun initView() {

        homeViewModel.tweetsData.removeObservers(this)
        homeViewModel.tweetsData.observe(this, Observer {
            Log.d("data", it.data.toString())
            binding.labelTv.text = it.toString()
        })
        homeViewModel.errorData.observe(this, Observer {
            Log.d("data", it.toString())
            binding.labelTv.text = it.toString()
        })
    }

}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.adapter.NewsAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.ork.simpleapp.model.BaseModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = NewsAdapter(myModels as ArrayList<BaseModel>)
        binding.recyclerView.adapter = recyclerView
    }
}
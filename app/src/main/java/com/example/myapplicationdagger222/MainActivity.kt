package com.example.myapplicationdagger222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationdagger222.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var myComponent: MyComponent
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent = (applicationContext as MyApplication).component
        myComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
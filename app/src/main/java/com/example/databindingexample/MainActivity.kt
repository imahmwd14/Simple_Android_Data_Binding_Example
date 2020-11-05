package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val function: (v: View, keyCode: Int, event: KeyEvent) -> Boolean = { v, keyCode, event ->
        binding.invalidateAll()
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.name = binding.editTextTextPersonName

        binding.editTextTextPersonName.setOnKeyListener(function)
    }
}
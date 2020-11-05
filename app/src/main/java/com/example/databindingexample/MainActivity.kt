package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.method.KeyListener
import android.view.KeyEvent
import android.view.View
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.security.Key

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.name = binding.editTextTextPersonName

        binding.editTextTextPersonName.doOnTextChanged { text, start, before, count ->
            binding.invalidateAll()
        }
    }
}
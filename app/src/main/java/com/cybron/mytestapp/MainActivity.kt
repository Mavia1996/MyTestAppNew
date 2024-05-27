package com.cybron.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cybron.mytestapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.apply {
            textView.setOnClickListener {
                Toast.makeText(this@MainActivity,"My First Toast at Cybron",Toast.LENGTH_SHORT)
            }
        }


    }
}
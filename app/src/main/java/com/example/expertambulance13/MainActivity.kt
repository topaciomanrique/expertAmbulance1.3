package com.example.expertambulance13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expertambulance13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpAction()
    }

    private fun setUpAction() {
        binding.btnEmergency.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}

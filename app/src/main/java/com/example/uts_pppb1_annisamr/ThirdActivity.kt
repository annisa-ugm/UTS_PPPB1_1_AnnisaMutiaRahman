package com.example.uts_pppb1_annisamr

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_pppb1_annisamr.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
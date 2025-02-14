package com.sanjeet.demosdk.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.sanjeet.demosdk.databinding.ActivityMySdkMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MySdkMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMySdkMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMySdkMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
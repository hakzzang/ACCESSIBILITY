package com.hbs.myaccessibility

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hbs.myaccessibility.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cardLabelFor.setOnClickListener {
            startActivity(Intent(this, LabelForActivity::class.java))
        }
        binding.cardMergeFocus.setOnClickListener {
            startActivity(Intent(this, MergeFocusActivity::class.java))
        }
        binding.cardSendEvent.setOnClickListener {
            startActivity(Intent(this, SendEventActivity::class.java))
        }
    }
}
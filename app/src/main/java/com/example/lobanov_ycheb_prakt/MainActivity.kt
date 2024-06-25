package com.example.lobanov_ycheb_prakt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.lobanov_ycheb_prakt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

            binding.buttonReplaceFragment.setOnClickListener {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameBlank2, BlankFragment.newInstance())
                    .commit()
            }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.FrameBlank2,BlankFragment2.newInstance())
            .commit()

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
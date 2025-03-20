package com.example.mapagrado

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mapagrado.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the click listener for the button
        binding.button.setOnClickListener {
            // Create an Intent to start MainActivity
            val intent = Intent(this, MainActivity::class.java)

            // Start the activity
            startActivity(intent)
        }
    }
}

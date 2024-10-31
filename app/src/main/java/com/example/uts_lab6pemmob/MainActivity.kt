// MainActivity.kt
package com.example.uts_lab6pemmob

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button by its ID
        val startButton = findViewById<Button>(R.id.startButton)

        // Set an onClickListener to the button
        startButton.setOnClickListener {
            // Create an Intent to start MainActivity2
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent) // Start MainActivity2
        }
    }
}

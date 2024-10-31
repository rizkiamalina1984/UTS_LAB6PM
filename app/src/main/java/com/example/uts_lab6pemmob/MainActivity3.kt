// MainActivity3.kt
package com.example.uts_lab6pemmob

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    private lateinit var name: String
    private lateinit var greeting: String
    private lateinit var message: String
    private lateinit var sender: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Retrieve data passed from MainActivity2
        name = intent.getStringExtra("name") ?: ""
        greeting = intent.getStringExtra("greeting") ?: ""
        message = intent.getStringExtra("message") ?: ""
        sender = intent.getStringExtra("sender") ?: ""

        // Set up click listeners for template selection
        findViewById<ImageView>(R.id.template1).setOnClickListener {
            navigateToTemplate(MainActivity4::class.java)
        }
        findViewById<ImageView>(R.id.template2).setOnClickListener {
            navigateToTemplate(MainActivity5::class.java)
        }
        findViewById<ImageView>(R.id.template3).setOnClickListener {
            navigateToTemplate(MainActivity6::class.java)
        }
    }

    private fun navigateToTemplate(activityClass: Class<*>) {
        val intent = Intent(this, activityClass).apply {
            putExtra("name", name)
            putExtra("greeting", greeting)
            putExtra("message", message)
            putExtra("sender", sender)
        }
        startActivity(intent)
    }
}

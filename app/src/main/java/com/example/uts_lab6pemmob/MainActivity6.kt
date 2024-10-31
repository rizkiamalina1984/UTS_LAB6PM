package com.example.uts_lab6pemmob

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        // Get data from Intent
        val name = intent.getStringExtra("name") ?: ""
        val greeting = intent.getStringExtra("greeting") ?: ""
        val message = intent.getStringExtra("message") ?: ""
        val sender = intent.getStringExtra("sender") ?: ""

        // Set data to the TextViews
        findViewById<TextView>(R.id.receiverNameTextView).text = "Dear $name"
        findViewById<TextView>(R.id.greetingTextView).text = greeting
        findViewById<TextView>(R.id.messageTextView).text = message
        findViewById<TextView>(R.id.senderNameTextView).text = "From: $sender"
    }
}

package com.example.uts_lab6pemmob

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_lab6pemmob.R

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

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

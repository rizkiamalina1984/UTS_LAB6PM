// MainActivity2.kt
package com.example.uts_lab6pemmob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var greetingEditText: EditText
    private lateinit var messageEditText: EditText
    private lateinit var senderEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Initialize the form fields
        nameEditText = findViewById(R.id.nameEditText)
        greetingEditText = findViewById(R.id.greetingEditText)
        messageEditText = findViewById(R.id.messageEditText)
        senderEditText = findViewById(R.id.senderEditText)

        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener {
            if (validateForm()) {
                // Get the form data
                val name = nameEditText.text.toString()
                val greeting = greetingEditText.text.toString()
                val message = messageEditText.text.toString()
                val sender = senderEditText.text.toString()

                // Pass the form data to MainActivity3
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("name", name)
                intent.putExtra("greeting", greeting)
                intent.putExtra("message", message)
                intent.putExtra("sender", sender)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validateForm(): Boolean {
        return nameEditText.text.isNotBlank() &&
                greetingEditText.text.isNotBlank() &&
                messageEditText.text.isNotBlank() &&
                senderEditText.text.isNotBlank()
    }
}

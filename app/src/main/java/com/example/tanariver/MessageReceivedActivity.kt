package com.example.tanariver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MessageReceivedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_received)
        val message = intent.getStringExtra(MESSAGE)
        val textView = findViewById<TextView>(R.id.messageTextView).apply {
            text = message
        }
    }
}
package com.voulagnan

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConversationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversation)

        val tvTitle = findViewById<TextView>(R.id.tv_conversation_title)
        val btnBack = findViewById<Button>(R.id.btn_back_conversation)

        tvTitle.text = getString(R.string.conversation_screen)
        
        btnBack.setOnClickListener {
            finish()
        }
    }
}

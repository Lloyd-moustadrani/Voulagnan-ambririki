package com.voulagnan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {
    private lateinit var chatMessagesContainer: LinearLayout
    private lateinit var etChatInput: EditText
    private lateinit var btnSend: Button
    private lateinit var btnBack: Button
    private var messageCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        // Initialiser les vues
        val tvTitle = findViewById<TextView>(R.id.tv_chat_title)
        chatMessagesContainer = findViewById(R.id.chat_messages_container)
        etChatInput = findViewById(R.id.et_chat_input)
        btnSend = findViewById(R.id.btn_send)
        btnBack = findViewById(R.id.btn_back_chat)

        tvTitle.text = getString(R.string.chat_screen)

        // Configurer les listeners
        btnSend.setOnClickListener {
            sendMessage()
        }

        btnBack.setOnClickListener {
            finish()
        }

        // Permettre d'envoyer un message en appuyant sur Entrée
        etChatInput.setOnEditorActionListener { _, _, _ ->
            sendMessage()
            true
        }
    }

    private fun sendMessage() {
        val messageText = etChatInput.text.toString().trim()

        if (messageText.isNotEmpty()) {
            // Créer un nouveau TextView pour le message
            val messageView = TextView(this).apply {
                text = "Vous: $messageText"
                textSize = 16f
                setPadding(16, 8, 16, 8)
                setTextColor(resources.getColor(R.color.on_background, null))
            }

            // Ajouter le message au conteneur
            chatMessagesContainer.addView(messageView)

            // Effacer le champ de saisie
            etChatInput.text.clear()

            // Ajouter une réponse simulée après 500ms
            chatMessagesContainer.postDelayed({
                val responseView = TextView(this).apply {
                    text = "Bot: J'ai reçu votre message!"
                    textSize = 16f
                    setPadding(16, 8, 16, 8)
                    setTextColor(resources.getColor(R.color.secondary, null))
                }
                chatMessagesContainer.addView(responseView)
            }, 500)

            messageCount++
        }
    }
}

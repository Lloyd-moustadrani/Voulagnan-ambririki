package com.voulagnan

data class Message(
    val id: Int,
    val content: String,
    val sender: String, // "user" ou "bot"
    val timestamp: Long = System.currentTimeMillis()
)

package com.example.android.architecture.blueprints.todoapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class TodoActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "StarDo ⭐ جاهز"
        text.textSize = 24f

        setContentView(text)
    }
}
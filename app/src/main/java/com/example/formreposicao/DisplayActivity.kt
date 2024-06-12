package com.example.formreposicao

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    private lateinit var tvName: TextView
    private lateinit var tvProfession: TextView
    private lateinit var tvEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        tvName = findViewById(R.id.tvName)
        tvProfession = findViewById(R.id.tvProfession)
        tvEmail = findViewById(R.id.tvEmail)

        val name = intent.getStringExtra("EXTRA_NAME")
        val profession = intent.getStringExtra("EXTRA_PROFESSION")
        val email = intent.getStringExtra("EXTRA_EMAIL")

        tvName.text = name
        tvProfession.text = profession
        tvEmail.text = email
    }
}
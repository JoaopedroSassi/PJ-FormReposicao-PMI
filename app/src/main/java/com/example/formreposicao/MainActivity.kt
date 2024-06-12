package com.example.formreposicao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etName: EditText
    private lateinit var etProfession: EditText
    private lateinit var etEmail: EditText
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etProfession = findViewById(R.id.etProfession)
        etEmail = findViewById(R.id.etEmail)
        btnSend = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            val name = etName.text.toString()
            val profession = etProfession.text.toString()
            val email = etEmail.text.toString()

            val intent = Intent(this, DisplayActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_PROFESSION", profession)
                putExtra("EXTRA_EMAIL", email)
            }
            startActivity(intent)
        }
    }
}
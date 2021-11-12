package com.ssindher.flavortest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var textInputEditTextUsername:TextInputEditText
    lateinit var textInputEditTextPassword:TextInputEditText
    lateinit var buttonLogin: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputEditTextUsername = findViewById(R.id.textInputEditTextUsername)
        textInputEditTextPassword = findViewById(R.id.textInputEditTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val uname = textInputEditTextUsername.text.toString()
            val pass = textInputEditTextPassword.text.toString()
            if (uname.isEmpty()){
                Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (pass.isEmpty()){
                Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (uname == "4005009009" && pass == "4005009009"){
                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            }
        }
    }
}
package com.projetos.txoza

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.projetos.txoza.util.User
import com.projetos.txoza.util.isEmailValid

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

        val inputEmail = findViewById<EditText>(R.id.edtText_email)
        val inputPassword = findViewById<EditText>(R.id.editTextTextPassword)
        val buttonLogin = findViewById<Button>(R.id.bt_login)
        val txtEmailInvalid = findViewById<TextView>(R.id.txt_invalidEmail)


        val txoza = User("Txoza", "txoza@teste.com", "teste123")

        buttonLogin.setOnClickListener() {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            when {
                isEmailValid(email) == false -> {
                    Toast.makeText(
                        applicationContext,
                        "Você não escreveu um Email",
                        Toast.LENGTH_SHORT
                    )
                        .show();
                }
                txoza.validateUSer(email, password) == false -> {
                    Toast.makeText(
                        applicationContext,
                        "Email ou senha inválido",
                        Toast.LENGTH_SHORT
                    ).show();
                }
                else -> startActivity(Intent(applicationContext, SecondActivity::class.java))
            }
        }

        inputEmail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s!!.isNotEmpty()) {
                   if (isEmailValid(s.toString()) == true) {
                       txtEmailInvalid.visibility = View.GONE
                       buttonLogin.setBackgroundColor(Color.GREEN)
                   }else txtEmailInvalid.visibility = View.VISIBLE
                }
            }
        })


    }
}
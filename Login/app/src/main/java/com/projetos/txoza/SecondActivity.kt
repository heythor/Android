package com.projetos.txoza

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.projetos.txoza.util.User
import com.projetos.txoza.util.isEmailValid

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        Toast.makeText(applicationContext, "Logado", Toast.LENGTH_SHORT).show();

    }
}
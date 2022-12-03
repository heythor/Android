package com.projetos.txoza.util

class User(
    name: String,
    email: String,
    password: String,
) {

   private val userPassword = password
    private val userEmail = email

    fun validateUser(email: String, password: String): Boolean {
        if (email == userEmail && password == userPassword) {
            return true
        }
        return false
    }
}
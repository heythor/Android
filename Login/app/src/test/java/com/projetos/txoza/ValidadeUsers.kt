package com.projetos.txoza

import com.projetos.txoza.util.User
import org.junit.Test
import org.junit.Assert.*

class ValidadeUsers {

    val txoza = User("Txoza", "txoza@teste.com", "12345")

    @Test
    fun userIsValid() {
        assertTrue(txoza.validateUSer("txoza@teste.com", "12345"))
    }

    @Test
    fun userEmailInvalid() {
        assertFalse(txoza.validateUSer("txoza@hotmail.com", "12345"))
    }

    @Test
    fun userPasswordInvalid() {
        assertFalse(txoza.validateUSer("txoza@teste.com", "1234"))
    }
}
package com.projetos.txoza

import com.projetos.txoza.util.User
import org.junit.Test
import org.junit.Assert.*

class TestUserValidation {


    @Test
    fun testWithValidEmailAndPassword() {

        val txoza = User("Txoza", "txoza@teste.com", "12345")
        val result = txoza.validateUser("txoza@teste.com", "12345")
        assertTrue(result)
    }

    @Test
    fun testWithInvalidEmail() {
        val txoza = User("Txoza", "txoza@teste.com", "12345")
        val result = txoza.validateUser("txoza@hotmail.com", "12345")
        assertFalse(result)
    }

    @Test
    fun testWithInvalidPassword() {
        val txoza = User("Txoza", "txoza@teste.com", "12345")
        val result = txoza.validateUser("txoza@teste.com", "1234")
        assertFalse(result)
    }

    @Test
    fun testWithEmptyEmail() {
        val txoza = User("Txoza", "txoza@teste.com", "12345")
        val result = txoza.validateUser("", "")
        assertFalse(result)
    }
}
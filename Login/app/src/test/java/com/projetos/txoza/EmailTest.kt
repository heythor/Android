package com.projetos.txoza

import com.projetos.txoza.util.isEmailValid
import org.junit.Test
import org.junit.Assert.*

class VerifyEmailTest {

    @Test
    fun testWithValidEmail() {
        val email = "email@test.com"
        val result = isEmailValid(email)
        assertTrue(result)
    }

    @Test
    fun testWithInvalidEmail(){
        val email = "email.email.com"
        val result = isEmailValid(email)
        assertFalse(result)
    }
}
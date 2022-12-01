package com.projetos.txoza

import com.projetos.txoza.util.isEmailValid
import org.junit.Test
import org.junit.Assert.*

class EmailTest {

    @Test
    fun emailIsValid() {
        val email = "email@test.com"
        assertTrue(isEmailValid(email))
    }

    @Test
    fun emailIsInvalid(){
        val email = "email.email.com"
        assertFalse(isEmailValid(email))
    }
}
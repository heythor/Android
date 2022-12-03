package com.projetos.txoza.util

import android.support.v4.util.PatternsCompat

fun isEmailValid(email: String): Boolean {
    return PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()
}

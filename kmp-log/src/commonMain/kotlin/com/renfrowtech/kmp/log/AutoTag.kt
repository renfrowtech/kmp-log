package com.renfrowtech.kmp.log

internal interface AutoTag {
    fun getTag(): String
}

internal expect fun getTag(): AutoTag
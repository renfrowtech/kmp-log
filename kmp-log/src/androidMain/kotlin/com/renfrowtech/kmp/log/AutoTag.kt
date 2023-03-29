package com.renfrowtech.kmp.log

import com.renfrowtech.kmp.log.extension.simpleClassName

internal class AndroidAutoTag : AutoTag {
    override fun getTag(): String {
        return Thread.currentThread().stackTrace[6].let {
            "${it.simpleClassName}.${it.methodName}"
        }
    }
}

internal actual fun getTag(): AutoTag = AndroidAutoTag()
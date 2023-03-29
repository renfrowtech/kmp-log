package com.renfrowtech.kmp.log.extension

internal val StackTraceElement.simpleClassName: String
    get() = Class.forName(this.className).simpleName
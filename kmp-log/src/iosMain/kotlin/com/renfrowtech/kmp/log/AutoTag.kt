package com.renfrowtech.kmp.log

@Suppress("ClassName")
internal class iOSAutoTag : AutoTag {
    override fun getTag(): String {
        return ""
    }
}

internal actual fun getTag(): AutoTag = iOSAutoTag()
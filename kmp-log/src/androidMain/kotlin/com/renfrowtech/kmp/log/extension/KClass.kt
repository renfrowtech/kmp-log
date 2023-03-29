package com.renfrowtech.kmp.log.extension

import kotlin.reflect.KClass

private fun getClass(clazz: KClass<*>): KClass<*> {
    return when {
        clazz.isInner -> getClass(clazz.java.enclosingClass.kotlin)
        clazz.isCompanion -> getClass(clazz.java.enclosingClass.kotlin)
        else -> clazz
    }
}
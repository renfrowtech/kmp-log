package com.renfrowtech.kmp.log.extension

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


internal fun String.toPrettyJsonIfValid(): String {
    return try {
        val json = Json { prettyPrint = true }
        val element = json.parseToJsonElement(this)
        json.encodeToString(element)
    } catch (ignored: Throwable) {
        this
    }
}
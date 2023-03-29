package com.renfrowtech.kmp.log.strategy

import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.renfrowtech.kmp.log.*
import com.renfrowtech.kmp.log.splitter.LogSplitter
import com.renfrowtech.kmp.log.splitter.LogcatSplitter
import org.jetbrains.annotations.VisibleForTesting

/**
 * Logging strategy for logging to Android Logcat
 */
@Suppress("unused")
class LogcatStrategy(
    override val minLogLevel: LogLevel = LogLevel.INFO,
    override val logSplitter: LogSplitter = LogcatSplitter()
) : LogStrategy {
    /**
     * Visible for unit testing only.
     */
    @VisibleForTesting
    internal fun getDataString(data: Map<String, Any?>): String {
        val gson: Gson = GsonBuilder()
            .serializeNulls()
            .setPrettyPrinting()
            .create()
        val gsonType = object : TypeToken<HashMap<String, Any?>?>() {}.type

        @Suppress("UnnecessaryVariable")
        val gsonString: String = gson.toJson(data, gsonType)

        return gsonString
    }

    @VisibleForTesting
    internal fun getMessageWithData(message: String?, data: Map<String, Any?>?): String {
        return "${message ?: "No message"}${if (!data.isNullOrEmpty()) "\ndata:${getDataString(data)}" else ""}"
    }

    @VisibleForTesting
    internal fun logWithFunction(
        tag: String,
        level: LogLevel,
        message: String?,
        data: Map<String, Any?>?,
        log: (logTag: String, logMessage: String) -> Unit
    ) {
        if (level.severity <= minLogLevel.severity) {

            val dataWithSev = (data?.toMutableMap() ?: mutableMapOf()).apply {
                put(KEY_SEVERITY, level)
            }

            logSplitter.split(
                message = getMessageWithData(message, dataWithSev),
                splitNewLines = true
            ).forEach {
                log(tag, it)
            }
        }
    }

    override fun emergency(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.EMERGENCY, message, data) { logTag, logMessage ->
            Log.wtf(logTag, logMessage)
        }
    }

    override fun alert(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.ALERT, message, data) { logTag, logMessage ->
            Log.wtf(logTag, logMessage)
        }
    }

    override fun critical(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.CRITICAL, message, data) { logTag, logMessage ->
            Log.e(logTag, logMessage)
        }
    }

    override fun error(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.ERROR, message, data) { logTag, logMessage ->
            Log.e(logTag, logMessage)
        }
    }

    override fun warning(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.WARNING, message, data) { logTag, logMessage ->
            Log.w(logTag, logMessage)
        }
    }

    override fun notice(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.NOTICE, message, data) { logTag, logMessage ->
            Log.i(logTag, logMessage)
        }
    }

    override fun info(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.INFO, message, data) { logTag, logMessage ->
            Log.i(logTag, logMessage)
        }
    }

    override fun debug(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.DEBUG, message, data) { logTag, logMessage ->
            Log.d(logTag, logMessage)
        }
    }

    override fun trace(message: String?, tag: String, data: Map<String, Any?>?) {
        logWithFunction(tag, LogLevel.TRACE, message, data) { logTag, logMessage ->
            Log.v(logTag, logMessage)
        }
    }
}
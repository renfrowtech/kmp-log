package com.renfrowtech.kmp.log.strategy

import com.renfrowtech.kmp.log.LogLevel
import com.renfrowtech.kmp.log.splitter.LogSplitter

/**
 * Wrapper interface around logging various messages to different locations (Logcat, Splunk, Crashlytics, Datadog, etc)
 */
interface LogStrategy {
    val logSplitter: LogSplitter
    val minLogLevel: LogLevel

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.EMERGENCY] or higher.
     *
     * Logs a emergency [message] with a given [tag] and any associated [data].
     */
    fun emergency(message: String?, tag: String, data: Map<String, Any?>? = null)

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.ALERT] or higher.
     *
     * Logs a alert [message] with a given [tag] and any associated [data].
     */
    fun alert(message: String?, tag: String, data: Map<String, Any?>? = null)

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.CRITICAL] or higher.
     *
     * Logs a critical [message] with a given [tag] and any associated [data].
     */
    fun critical(message: String?, tag: String, data: Map<String, Any?>? = null)

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.ERROR] or higher.
     *
     * Logs a error [message] with a given [tag] and any associated [data].
     */
    fun error(message: String?, tag: String, data: Map<String, Any?>? = null)

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.WARNING] or higher.
     *
     * Logs a warning [message] with a given [tag] and any associated [data].
     */
    fun warning(message: String?, tag: String, data: Map<String, Any?>? = null)

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.NOTICE] or higher.
     *
     * Logs a notice( [message] with a given [tag] and any associated [data].
     */
    fun notice(message: String?, tag: String, data: Map<String, Any?>? = null)

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.INFO] or higher.
     *
     * Logs a info( [message] with a given [tag] and any associated [data].
     */
    fun info(message: String?, tag: String, data: Map<String, Any?>? = null)

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.DEBUG] or higher.
     *
     * Logs a debug [message] with a given [tag] and any associated [data] will only occur in debug builds.
     */
    fun debug(message: String?, tag: String, data: Map<String, Any?>? = null)

    /**
     * Will only log if [minLogLevel] is set to [LogLevel.TRACE] or higher.
     *
     * Logs a trace [message] with a given [tag] and any associated [data] will only occur in debug builds.
     */
    fun trace(message: String?, tag: String, data: Map<String, Any?>? = null)
}
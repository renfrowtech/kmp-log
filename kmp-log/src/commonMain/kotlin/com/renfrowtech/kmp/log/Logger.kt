package com.renfrowtech.kmp.log

import com.renfrowtech.kmp.log.strategy.LogStrategy
import kotlin.jvm.JvmStatic

/**
 * Wrapper interface around logging various messages
 */
@Suppress("unused")
interface Logger {

    /**
     * Returns a new Logger instance
     */
    fun withTag(tag: String?): Logger

    /**
     * Returns a new Logger instance with the associated data. Depending on the strategy this data
     * may be logged with the message ormight be submitted as ancillary data to help with
     * aggregations.
     */
    fun withData(vararg data: Pair<String, Any?>): Logger

    /**
     * Returns a new Logger instance with the associated data. Depending on the strategy this data
     * may be logged with the message ormight be submitted as ancillary data to help with
     * aggregations.
     */
    fun withData(data: Map<String, Any?>): Logger

    /**
     * Returns a new Logger instance with the associated exception data. Depending on the strategy
     * this data may be logged with the message or might be submitted as ancillary data to help with
     * aggregations.
     */
    fun withException(e: Throwable): Logger

    /**
     * Logs an emergency error and optional tag
     */
    fun emergency(message: String?, tag: String? = null)

    /**
     * Logs an alert error and optional tag
     */
    fun alert(message: String?, tag: String? = null)

    /**
     * Logs a critical error and optional tag
     */
    fun critical(message: String?, tag: String? = null)

    /**
     * Logs an error and optional tag
     */
    fun error(message: String?, tag: String? = null)

    /**
     * Logs a warning message and optional tag
     */
    fun warning(message: String?, tag: String? = null)

    /**
     * Logs an notice message and optional tag
     */
    fun notice(message: String?, tag: String? = null)

    /**
     * Logs an info message and optional tag
     */
    fun info(message: String?, tag: String? = null)

    /**
     * Logs a debug message and optional tag
     */
    fun debug(message: String?, tag: String? = null)

    /**
     * Logs a verbose message and optional tag
     */
    fun trace(message: String?, tag: String? = null)

    companion object {
        @Suppress("ObjectPropertyName")
        private val _strats = mutableListOf<LogStrategy>()
        internal val strats: List<LogStrategy> = _strats

        @JvmStatic
        fun addStrategies(vararg strategies: LogStrategy) {
            _strats.addAll(strategies)
        }

        @JvmStatic
        fun removeStrategies(vararg strategies: LogStrategy) {
            _strats.removeAll(strategies.toSet())
        }

        fun clearStrategies() {
            _strats.clear()
        }
    }
}
package com.renfrowtech.kmp.log

/**
 * Represents the different log levels available for logging. Depending on the LogStrategy implementation,
 * different log levels may be represented by the same system log level.
 *
 * @property printName
 */
enum class LogLevel(val severity: Int, val printName: String) {
    /**
     * The highest log level. Used to indicate an emergency situation
     */
    EMERGENCY(0, "emergency"),

    /**
     *  The second highest log level. Used to indicate a situation where someone should be alerted
     */
    ALERT(1, "alert"),

    /**
     *  The third highest log level. Used to indicate a critical situation that should be dealt with quickly.
     */
    CRITICAL(2, "critical"),

    /**
     *  The fourth highest log level. Used to indicate an error case, typically an exception.
     */
    ERROR(3, "error"),

    /**
     *  The fifth highest log level. Used to indicate a handled but unexpected case.
     */
    WARNING(4, "warning"),

    /**
     *  The sixth highest log level. Used to indicate a non-critical situation.
     */
    NOTICE(5, "notice"),

    /**
     *  The seventh highest log level. Used to provide information that can be helpful.
     */
    INFO(6, "info"),

    /**
     *  The eighth highest log level. Used to aid in debugging a problem..
     */
    DEBUG(7, "debug"),

    /**
     *  The ninth highest and most verbose log level. Used to provide extremely detailed information.
     */
    TRACE(8, "trace");
}
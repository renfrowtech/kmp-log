package com.renfrowtech.kmp.log.splitter

import com.renfrowtech.kmp.log.extension.toPrettyJsonIfValid

/**
 * Interface for splitting log lines at new lines, pretty printing JSON and at
 * [maxLogLineBytesDefault] characters
 */
interface LogSplitter {
    /**
     * The maximum number of characters in a log line
     */
    val maxLogLineBytesDefault: Int

    /**
     * Splits log message into multiple messages
     *
     * @param message - Original message
     * @param maxLogLineBytes - Maximum log characters. Defaults to [maxLogLineBytesDefault]
     * @param splitNewLines - If true, splits at '\n' as well as at character count. Defaults to true
     * @return
     */
    fun split(
        message: String,
        maxLogLineBytes: Int = maxLogLineBytesDefault,
        splitNewLines: Boolean = true
    ): List<String> {
        val splitMessage = if (splitNewLines) {
            message.split("\n")
        } else {
            listOf(message)
        }.flatMap {
            it.toPrettyJsonIfValid().split("\n")
        }

        return splitMessage.flatMap {
            if (it.length > maxLogLineBytes) {
                it.chunked(maxLogLineBytes)
            } else {
                listOf(it)
            }
        }
    }
}
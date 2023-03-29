package com.renfrowtech.kmp.log.splitter

/**
 * [LogSplitter] implementation that divides at 4000 characters
 */
class LogcatSplitter : LogSplitter {
    override val maxLogLineBytesDefault: Int = 4000
}
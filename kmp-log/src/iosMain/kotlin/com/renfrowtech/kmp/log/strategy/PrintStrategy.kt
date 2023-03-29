package com.renfrowtech.kmp.log.strategy

import com.renfrowtech.kmp.log.LogLevel
import com.renfrowtech.kmp.log.splitter.LogSplitter
import com.renfrowtech.kmp.log.splitter.PrintSplitter

class PrintStrategy(
    override val minLogLevel: LogLevel = LogLevel.INFO,
    override val logSplitter: LogSplitter = PrintSplitter()
) : LogStrategy {
    override fun emergency(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }

    override fun alert(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }

    override fun critical(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }

    override fun error(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }

    override fun warning(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }

    override fun notice(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }

    override fun info(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }

    override fun debug(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }

    override fun trace(message: String?, tag: String, data: Map<String, Any?>?) {
        //TODO("Not yet implemented")
    }
}
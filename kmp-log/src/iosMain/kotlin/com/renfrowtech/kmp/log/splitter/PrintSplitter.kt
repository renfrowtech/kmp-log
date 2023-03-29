package com.renfrowtech.kmp.log.splitter

class PrintSplitter : LogSplitter {
    override val maxLogLineBytesDefault: Int = 4000
}
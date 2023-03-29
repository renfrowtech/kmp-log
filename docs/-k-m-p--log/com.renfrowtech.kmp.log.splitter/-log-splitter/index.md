//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.splitter](../index.md)
/[LogSplitter](index.md)

# LogSplitter

interface [LogSplitter](index.md)

Interface for splitting log lines at new lines, pretty printing JSON and
at [maxLogLineBytesDefault](max-log-line-bytes-default.md) characters

#### Inheritors

| |
|---|
| LogcatSplitter |
| PrintSplitter |

## Functions

| Name | Summary |
|---|---|
| [split](split.md) | [common]<br>open fun [split](split.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), maxLogLineBytes: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = maxLogLineBytesDefault, splitNewLines: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Splits log message into multiple messages |

## Properties

| Name | Summary |
|---|---|
| [maxLogLineBytesDefault](max-log-line-bytes-default.md) | [common]<br>abstract val [maxLogLineBytesDefault](max-log-line-bytes-default.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The maximum number of characters in a log line |

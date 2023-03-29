//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogcatStrategy](index.md)

# LogcatStrategy

[android]\
class [LogcatStrategy](index.md)(val minLogLevel: LogLevel = LogLevel.INFO, val logSplitter:
LogSplitter = LogcatSplitter()) : LogStrategy

Logging strategy for logging to Android Logcat

## Constructors

| | |
|---|---|
| [LogcatStrategy](-logcat-strategy.md) | [android]<br>constructor(minLogLevel: LogLevel = LogLevel.INFO, logSplitter: LogSplitter = LogcatSplitter()) |

## Functions

| Name | Summary |
|---|---|
| [alert](alert.md) | [android]<br>open override fun [alert](alert.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.ALERT or higher. |
| [critical](critical.md) | [android]<br>open override fun [critical](critical.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.CRITICAL or higher. |
| [debug](debug.md) | [android]<br>open override fun [debug](debug.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.DEBUG or higher. |
| [emergency](emergency.md) | [android]<br>open override fun [emergency](emergency.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.EMERGENCY or higher. |
| [error](error.md) | [android]<br>open override fun [error](error.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.ERROR or higher. |
| [info](info.md) | [android]<br>open override fun [info](info.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.INFO or higher. |
| [notice](notice.md) | [android]<br>open override fun [notice](notice.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.NOTICE or higher. |
| [trace](trace.md) | [android]<br>open override fun [trace](trace.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.TRACE or higher. |
| [warning](warning.md) | [android]<br>open override fun [warning](warning.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.WARNING or higher. |

## Properties

| Name | Summary |
|---|---|
| [logSplitter](log-splitter.md) | [android]<br>open override val [logSplitter](log-splitter.md): LogSplitter |
| [minLogLevel](min-log-level.md) | [android]<br>open override val [minLogLevel](min-log-level.md): LogLevel |

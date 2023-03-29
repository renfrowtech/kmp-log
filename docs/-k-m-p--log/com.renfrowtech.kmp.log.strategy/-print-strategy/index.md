//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[PrintStrategy](index.md)

# PrintStrategy

[ios]\
class [PrintStrategy](index.md)(val minLogLevel: LogLevel = LogLevel.INFO, val logSplitter:
LogSplitter = PrintSplitter()) : LogStrategy

## Constructors

| | |
|---|---|
| [PrintStrategy](-print-strategy.md) | [ios]<br>constructor(minLogLevel: LogLevel = LogLevel.INFO, logSplitter: LogSplitter = PrintSplitter()) |

## Functions

| Name | Summary |
|---|---|
| [alert](alert.md) | [ios]<br>open override fun [alert](alert.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.ALERT or higher. |
| [critical](critical.md) | [ios]<br>open override fun [critical](critical.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.CRITICAL or higher. |
| [debug](debug.md) | [ios]<br>open override fun [debug](debug.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.DEBUG or higher. |
| [emergency](emergency.md) | [ios]<br>open override fun [emergency](emergency.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.EMERGENCY or higher. |
| [error](error.md) | [ios]<br>open override fun [error](error.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.ERROR or higher. |
| [info](info.md) | [ios]<br>open override fun [info](info.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.INFO or higher. |
| [notice](notice.md) | [ios]<br>open override fun [notice](notice.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.NOTICE or higher. |
| [trace](trace.md) | [ios]<br>open override fun [trace](trace.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.TRACE or higher. |
| [warning](warning.md) | [ios]<br>open override fun [warning](warning.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)<br>Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.WARNING or higher. |

## Properties

| Name | Summary |
|---|---|
| [logSplitter](log-splitter.md) | [ios]<br>open override val [logSplitter](log-splitter.md): LogSplitter |
| [minLogLevel](min-log-level.md) | [ios]<br>open override val [minLogLevel](min-log-level.md): LogLevel |

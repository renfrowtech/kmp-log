//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)

# LogStrategy

interface [LogStrategy](index.md)

Wrapper interface around logging various messages to different locations (Logcat, Splunk,
Crashlytics, Datadog, etc)

#### Inheritors

| |
|---|
| LogcatStrategy |
| PrintStrategy |

## Functions

| Name | Summary |
|---|---|
| [alert](alert.md) | [common]<br>abstract fun [alert](alert.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.ALERT](../../com.renfrowtech.kmp.log/-log-level/-a-l-e-r-t/index.md) or higher. |
| [critical](critical.md) | [common]<br>abstract fun [critical](critical.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.CRITICAL](../../com.renfrowtech.kmp.log/-log-level/-c-r-i-t-i-c-a-l/index.md) or higher. |
| [debug](debug.md) | [common]<br>abstract fun [debug](debug.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.DEBUG](../../com.renfrowtech.kmp.log/-log-level/-d-e-b-u-g/index.md) or higher. |
| [emergency](emergency.md) | [common]<br>abstract fun [emergency](emergency.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.EMERGENCY](../../com.renfrowtech.kmp.log/-log-level/-e-m-e-r-g-e-n-c-y/index.md) or higher. |
| [error](error.md) | [common]<br>abstract fun [error](error.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.ERROR](../../com.renfrowtech.kmp.log/-log-level/-e-r-r-o-r/index.md) or higher. |
| [info](info.md) | [common]<br>abstract fun [info](info.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.INFO](../../com.renfrowtech.kmp.log/-log-level/-i-n-f-o/index.md) or higher. |
| [notice](notice.md) | [common]<br>abstract fun [notice](notice.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.NOTICE](../../com.renfrowtech.kmp.log/-log-level/-n-o-t-i-c-e/index.md) or higher. |
| [trace](trace.md) | [common]<br>abstract fun [trace](trace.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.TRACE](../../com.renfrowtech.kmp.log/-log-level/-t-r-a-c-e/index.md) or higher. |
| [warning](warning.md) | [common]<br>abstract fun [warning](warning.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)<br>Will only log if [minLogLevel](min-log-level.md) is set to [LogLevel.WARNING](../../com.renfrowtech.kmp.log/-log-level/-w-a-r-n-i-n-g/index.md) or higher. |

## Properties

| Name | Summary |
|---|---|
| [logSplitter](log-splitter.md) | [common]<br>abstract val [logSplitter](log-splitter.md): [LogSplitter](../../com.renfrowtech.kmp.log.splitter/-log-splitter/index.md) |
| [minLogLevel](min-log-level.md) | [common]<br>abstract val [minLogLevel](min-log-level.md): [LogLevel](../../com.renfrowtech.kmp.log/-log-level/index.md) |

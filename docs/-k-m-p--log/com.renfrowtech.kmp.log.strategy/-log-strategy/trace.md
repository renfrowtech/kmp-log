//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[trace](trace.md)

# trace

[common]\
abstract fun [trace](trace.md)(
message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,
tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)

Will only log if [minLogLevel](min-log-level.md) is set
to [LogLevel.TRACE](../../com.renfrowtech.kmp.log/-log-level/-t-r-a-c-e/index.md) or higher.

Logs a trace [message](trace.md) with a given [tag](trace.md) and any associated [data](trace.md)
will only occur in debug builds.

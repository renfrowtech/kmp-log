//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[notice](notice.md)

# notice

[common]\
abstract fun [notice](notice.md)(
message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,
tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)

Will only log if [minLogLevel](min-log-level.md) is set
to [LogLevel.NOTICE](../../com.renfrowtech.kmp.log/-log-level/-n-o-t-i-c-e/index.md) or higher.

Logs a notice( [message](notice.md) with a given [tag](notice.md) and any
associated [data](notice.md).

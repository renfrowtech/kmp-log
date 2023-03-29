//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[alert](alert.md)

# alert

[common]\
abstract fun [alert](alert.md)(
message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,
tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)

Will only log if [minLogLevel](min-log-level.md) is set
to [LogLevel.ALERT](../../com.renfrowtech.kmp.log/-log-level/-a-l-e-r-t/index.md) or higher.

Logs a alert [message](alert.md) with a given [tag](alert.md) and any associated [data](alert.md).

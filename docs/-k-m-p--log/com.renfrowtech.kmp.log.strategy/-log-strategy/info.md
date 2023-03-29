//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[info](info.md)

# info

[common]\
abstract fun [info](info.md)(
message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,
tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)

Will only log if [minLogLevel](min-log-level.md) is set
to [LogLevel.INFO](../../com.renfrowtech.kmp.log/-log-level/-i-n-f-o/index.md) or higher.

Logs a info( [message](info.md) with a given [tag](info.md) and any associated [data](info.md).

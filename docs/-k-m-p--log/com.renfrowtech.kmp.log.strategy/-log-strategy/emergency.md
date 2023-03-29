//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[emergency](emergency.md)

# emergency

[common]\
abstract fun [emergency](emergency.md)(
message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,
tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;? = null)

Will only log if [minLogLevel](min-log-level.md) is set
to [LogLevel.EMERGENCY](../../com.renfrowtech.kmp.log/-log-level/-e-m-e-r-g-e-n-c-y/index.md) or
higher.

Logs a emergency [message](emergency.md) with a given [tag](emergency.md) and any
associated [data](emergency.md).

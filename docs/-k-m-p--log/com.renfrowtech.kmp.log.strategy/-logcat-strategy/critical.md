//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogcatStrategy](index.md)/[critical](critical.md)

# critical

[android]\
open override fun [critical](critical.md)(
message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,
tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)

Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.CRITICAL or higher.

Logs a critical [message](critical.md) with a given [tag](critical.md) and any
associated [data](critical.md).

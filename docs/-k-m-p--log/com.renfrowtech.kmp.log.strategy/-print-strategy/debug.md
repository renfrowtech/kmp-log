//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[PrintStrategy](index.md)/[debug](debug.md)

# debug

[ios]\
open override fun [debug](debug.md)(
message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,
tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;?)

Will only log if [minLogLevel](min-log-level.md) is set to LogLevel.DEBUG or higher.

Logs a debug [message](debug.md) with a given [tag](debug.md) and any associated [data](debug.md)
will only occur in debug builds.

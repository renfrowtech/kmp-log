//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[PrintStrategy](index.md)/[trace](trace.md)

# trace

[ios]\

public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[trace](trace.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)
message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)
tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

Will only log if [minLogLevel](index.md#-385182634%2FProperties%2F-1207404352) is set to
LogLevel.TRACE or higher.

Logs a trace [message](trace.md) with a given [tag](trace.md) and any associated [data](trace.md)
will only occur in debug builds.

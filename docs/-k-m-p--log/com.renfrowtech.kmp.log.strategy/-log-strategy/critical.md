//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[critical](critical.md)

# critical

[common]\

public
abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[critical](critical.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)
message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)
tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

Will only log if minLogLevel is set
to [LogLevel.CRITICAL](../../com.renfrowtech.kmp.log/-log-level/-c-r-i-t-i-c-a-l/index.md) or
higher.

Logs a critical [message](critical.md) with a given [tag](critical.md) and any
associated [data](critical.md).

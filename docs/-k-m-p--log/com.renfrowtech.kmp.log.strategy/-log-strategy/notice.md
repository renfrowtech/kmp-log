//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[notice](notice.md)

# notice

[common]\

public
abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[notice](notice.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)
message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)
tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

Will only log if minLogLevel is set
to [LogLevel.NOTICE](../../com.renfrowtech.kmp.log/-log-level/-n-o-t-i-c-e/index.md) or higher.

Logs a notice( [message](notice.md) with a given [tag](notice.md) and any
associated [data](notice.md).

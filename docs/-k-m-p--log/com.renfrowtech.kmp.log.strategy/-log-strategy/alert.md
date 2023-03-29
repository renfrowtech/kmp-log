//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[alert](alert.md)

# alert

[common]\

public
abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[alert](alert.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)
message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)
tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

Will only log if minLogLevel is set
to [LogLevel.ALERT](../../com.renfrowtech.kmp.log/-log-level/-a-l-e-r-t/index.md) or higher.

Logs a alert [message](alert.md) with a given [tag](alert.md) and any associated [data](alert.md).

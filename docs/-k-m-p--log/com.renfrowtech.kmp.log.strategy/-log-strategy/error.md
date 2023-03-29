//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[error](error.md)

# error

[common]\

public
abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[error](error.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)
message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)
tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

Will only log if minLogLevel is set
to [LogLevel.ERROR](../../com.renfrowtech.kmp.log/-log-level/-e-r-r-o-r/index.md) or higher.

Logs a error [message](error.md) with a given [tag](error.md) and any associated [data](error.md).

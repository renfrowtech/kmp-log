//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)/[debug](debug.md)

# debug

[common]\

public
abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[debug](debug.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)
message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)
tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

Will only log if minLogLevel is set
to [LogLevel.DEBUG](../../com.renfrowtech.kmp.log/-log-level/-d-e-b-u-g/index.md) or higher.

Logs a debug [message](debug.md) with a given [tag](debug.md) and any associated [data](debug.md)
will only occur in debug builds.

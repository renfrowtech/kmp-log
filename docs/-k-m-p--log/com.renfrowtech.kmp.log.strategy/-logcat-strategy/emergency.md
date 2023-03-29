//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogcatStrategy](index.md)/[emergency](emergency.md)

# emergency

[android]\

public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[emergency](emergency.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)
message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)
tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to
LogLevel.EMERGENCY or higher.

Logs a emergency [message](emergency.md) with a given [tag](emergency.md) and any
associated [data](emergency.md).

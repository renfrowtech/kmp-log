//[KMP-Log](../../index.md)/[com.renfrowtech.kmp.log](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [Logger](-logger/index.md) | [common]<br>interface [Logger](-logger/index.md)<br>Wrapper interface around logging various messages |
| [LoggerDelegate](-logger-delegate/index.md) | [common]<br>class [LoggerDelegate](-logger-delegate/index.md)&lt;in [T](-logger-delegate/index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [ReadOnlyProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)&lt;[T](-logger-delegate/index.md), [Logger](-logger/index.md)&gt; <br>Delegate for retrieving a [Logger](-logger/index.md) implementation |
| [LogLevel](-log-level/index.md) | [common]<br>enum [LogLevel](-log-level/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[LogLevel](-log-level/index.md)&gt; <br>Represents the different log levels available for logging. Depending on the LogStrategy implementation, different log levels may be represented by the same system log level. |

//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.splitter](../index.md)
/[PrintSplitter](index.md)

# PrintSplitter

[ios]\
class [PrintSplitter](index.md) : LogSplitter

## Constructors

| | |
|---|---|
| [PrintSplitter](-print-splitter.md) | [ios]<br>constructor() |

## Functions

| Name | Summary |
|---|---|
| [split](index.md#-620341444%2FFunctions%2F-1207404352) | [ios]<br>open fun [split](index.md#-620341444%2FFunctions%2F-1207404352)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), maxLogLineBytes: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = maxLogLineBytesDefault, splitNewLines: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Splits log message into multiple messages |

## Properties

| Name | Summary |
|---|---|
| [maxLogLineBytesDefault](max-log-line-bytes-default.md) | [ios]<br>open override val [maxLogLineBytesDefault](max-log-line-bytes-default.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 4000<br>The maximum number of characters in a log line |

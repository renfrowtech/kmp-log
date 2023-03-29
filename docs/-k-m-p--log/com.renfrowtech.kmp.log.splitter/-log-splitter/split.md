//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.splitter](../index.md)
/[LogSplitter](index.md)/[split](split.md)

# split

[common]\
open fun [split](split.md)(
message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),
maxLogLineBytes: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) =
maxLogLineBytesDefault,
splitNewLines: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) =
true): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;

Splits log message into multiple messages

#### Return

#### Parameters

common

| | |
|---|---|
| message | - Original message |
| maxLogLineBytes | - Maximum log characters. Defaults to [maxLogLineBytesDefault](max-log-line-bytes-default.md) |
| splitNewLines | - If true, splits at '\n' as well as at character count. Defaults to true |

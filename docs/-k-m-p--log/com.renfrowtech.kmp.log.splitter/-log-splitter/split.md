//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.splitter](../index.md)
/[LogSplitter](index.md)/[split](split.md)

# split

[common]\

public [List](https://developer.android.com/reference/kotlin/java/util/List.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
&gt;[split](split.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)
message, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)
maxLogLineBytes, [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)
splitNewLines)

Splits log message into multiple messages

#### Return

#### Parameters

common

| | |
|---|---|
| message | - Original message |
| maxLogLineBytes | - Maximum log characters. Defaults to maxLogLineBytesDefault |
| splitNewLines | - If true, splits at '\n' as well as at character count. Defaults to true |

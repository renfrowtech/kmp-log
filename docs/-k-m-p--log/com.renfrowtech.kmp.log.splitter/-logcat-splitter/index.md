//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.splitter](../index.md)
/[LogcatSplitter](index.md)

# LogcatSplitter

[android]\
public final class [LogcatSplitter](index.md) implements LogSplitter

LogSplitter implementation that divides at 4000 characters

## Constructors

| | |
|---|---|
| [LogcatSplitter](-logcat-splitter.md) | [android]<br>public [LogcatSplitter](index.md)[LogcatSplitter](-logcat-splitter.md)() |

## Functions

| Name | Summary |
|---|---|
| [getMaxLogLineBytesDefault](get-max-log-line-bytes-default.md) | [android]<br>public [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getMaxLogLineBytesDefault](get-max-log-line-bytes-default.md)()<br>The maximum number of characters in a log line |
| [split](index.md#-620341444%2FFunctions%2F-2091286910) | [android]<br>public [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)&gt;[split](index.md#-620341444%2FFunctions%2F-2091286910)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)maxLogLineBytes, [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)splitNewLines)<br>Splits log message into multiple messages |

## Properties

| Name | Summary |
|---|---|
| [maxLogLineBytesDefault](index.md#-1710464187%2FProperties%2F-2091286910) | [android]<br>private final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[maxLogLineBytesDefault](index.md#-1710464187%2FProperties%2F-2091286910)<br>The maximum number of characters in a log line |

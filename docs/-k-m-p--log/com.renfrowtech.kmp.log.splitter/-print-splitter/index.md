//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.splitter](../index.md)
/[PrintSplitter](index.md)

# PrintSplitter

[ios]\
public final class [PrintSplitter](index.md) implements LogSplitter

## Constructors

| | |
|---|---|
| [PrintSplitter](-print-splitter.md) | [ios]<br>public [PrintSplitter](index.md)[PrintSplitter](-print-splitter.md)() |

## Functions

| Name | Summary |
|---|---|
| [getMaxLogLineBytesDefault](get-max-log-line-bytes-default.md) | [ios]<br>public [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getMaxLogLineBytesDefault](get-max-log-line-bytes-default.md)()<br>The maximum number of characters in a log line |
| [split](index.md#-620341444%2FFunctions%2F-1207404352) | [ios]<br>public [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)&gt;[split](index.md#-620341444%2FFunctions%2F-1207404352)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)maxLogLineBytes, [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)splitNewLines)<br>Splits log message into multiple messages |

## Properties

| Name | Summary |
|---|---|
| [maxLogLineBytesDefault](index.md#925959568%2FProperties%2F-1207404352) | [ios]<br>private final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[maxLogLineBytesDefault](index.md#925959568%2FProperties%2F-1207404352)<br>The maximum number of characters in a log line |

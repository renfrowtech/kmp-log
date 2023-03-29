//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.splitter](../index.md)
/[LogSplitter](index.md)

# LogSplitter

public interface [LogSplitter](index.md)

Interface for splitting log lines at new lines, pretty printing JSON and at maxLogLineBytesDefault
characters

#### Inheritors

| |
|---|
| LogcatSplitter |
| PrintSplitter |

## Functions

| Name | Summary |
|---|---|
| [getMaxLogLineBytesDefault](get-max-log-line-bytes-default.md) | [common]<br>public abstract [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getMaxLogLineBytesDefault](get-max-log-line-bytes-default.md)()<br>The maximum number of characters in a log line |
| [split](split.md) | [common]<br>public [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)&gt;[split](split.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)maxLogLineBytes, [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)splitNewLines)<br>Splits log message into multiple messages |

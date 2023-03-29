//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogcatStrategy](index.md)

# LogcatStrategy

[android]\
public final class [LogcatStrategy](index.md) implements LogStrategy

Logging strategy for logging to Android Logcat

## Constructors

| | |
|---|---|
| [LogcatStrategy](-logcat-strategy.md) | [android]<br>public [LogcatStrategy](index.md)[LogcatStrategy](-logcat-strategy.md)(LogLevelminLogLevel, LogSplitterlogSplitter) |

## Functions

| Name | Summary |
|---|---|
| [alert](alert.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[alert](alert.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.ALERT or higher. |
| [critical](critical.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[critical](critical.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.CRITICAL or higher. |
| [debug](debug.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[debug](debug.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.DEBUG or higher. |
| [emergency](emergency.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[emergency](emergency.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.EMERGENCY or higher. |
| [error](error.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[error](error.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.ERROR or higher. |
| [getLogSplitter](get-log-splitter.md) | [android]<br>public LogSplitter[getLogSplitter](get-log-splitter.md)() |
| [getMinLogLevel](get-min-log-level.md) | [android]<br>public LogLevel[getMinLogLevel](get-min-log-level.md)() |
| [info](info.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[info](info.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.INFO or higher. |
| [notice](notice.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[notice](notice.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.NOTICE or higher. |
| [trace](trace.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[trace](trace.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.TRACE or higher. |
| [warning](warning.md) | [android]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[warning](warning.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) is set to LogLevel.WARNING or higher. |

## Properties

| Name | Summary |
|---|---|
| [logSplitter](index.md#-1967863904%2FProperties%2F-2091286910) | [android]<br>private final LogSplitter[logSplitter](index.md#-1967863904%2FProperties%2F-2091286910) |
| [minLogLevel](index.md#929552537%2FProperties%2F-2091286910) | [android]<br>private final LogLevel[minLogLevel](index.md#929552537%2FProperties%2F-2091286910) |

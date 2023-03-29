//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log.strategy](../index.md)
/[LogStrategy](index.md)

# LogStrategy

public interface [LogStrategy](index.md)

Wrapper interface around logging various messages to different locations (Logcat, Splunk,
Crashlytics, Datadog, etc)

#### Inheritors

| |
|---|
| LogcatStrategy |
| PrintStrategy |

## Functions

| Name | Summary |
|---|---|
| [alert](alert.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[alert](alert.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.ALERT](../../com.renfrowtech.kmp.log/-log-level/-a-l-e-r-t/index.md) or higher. |
| [critical](critical.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[critical](critical.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.CRITICAL](../../com.renfrowtech.kmp.log/-log-level/-c-r-i-t-i-c-a-l/index.md) or higher. |
| [debug](debug.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[debug](debug.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.DEBUG](../../com.renfrowtech.kmp.log/-log-level/-d-e-b-u-g/index.md) or higher. |
| [emergency](emergency.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[emergency](emergency.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.EMERGENCY](../../com.renfrowtech.kmp.log/-log-level/-e-m-e-r-g-e-n-c-y/index.md) or higher. |
| [error](error.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[error](error.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.ERROR](../../com.renfrowtech.kmp.log/-log-level/-e-r-r-o-r/index.md) or higher. |
| [getLogSplitter](get-log-splitter.md) | [common]<br>public abstract [LogSplitter](../../com.renfrowtech.kmp.log.splitter/-log-splitter/index.md)[getLogSplitter](get-log-splitter.md)() |
| [getMinLogLevel](get-min-log-level.md) | [common]<br>public abstract [LogLevel](../../com.renfrowtech.kmp.log/-log-level/index.md)[getMinLogLevel](get-min-log-level.md)() |
| [info](info.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[info](info.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.INFO](../../com.renfrowtech.kmp.log/-log-level/-i-n-f-o/index.md) or higher. |
| [notice](notice.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[notice](notice.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.NOTICE](../../com.renfrowtech.kmp.log/-log-level/-n-o-t-i-c-e/index.md) or higher. |
| [trace](trace.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[trace](trace.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.TRACE](../../com.renfrowtech.kmp.log/-log-level/-t-r-a-c-e/index.md) or higher. |
| [warning](warning.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[warning](warning.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag, [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Will only log if minLogLevel is set to [LogLevel.WARNING](../../com.renfrowtech.kmp.log/-log-level/-w-a-r-n-i-n-g/index.md) or higher. |
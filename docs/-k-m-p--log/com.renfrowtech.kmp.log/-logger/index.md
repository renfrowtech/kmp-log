//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[Logger](index.md)

# Logger

[common]\
public interface [Logger](index.md)

Wrapper interface around logging various messages

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>public class [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [alert](alert.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[alert](alert.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs an alert error and optional tag |
| [critical](critical.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[critical](critical.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs a critical error and optional tag |
| [debug](debug.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[debug](debug.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs a debug message and optional tag |
| [emergency](emergency.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[emergency](emergency.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs an emergency error and optional tag |
| [error](error.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[error](error.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs an error and optional tag |
| [info](info.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[info](info.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs an info message and optional tag |
| [notice](notice.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[notice](notice.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs an notice message and optional tag |
| [trace](trace.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[trace](trace.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs a verbose message and optional tag |
| [warning](warning.md) | [common]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[warning](warning.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)message, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Logs a warning message and optional tag |
| [withData](with-data.md) | [common]<br>public abstract [Logger](index.md)[withData](with-data.md)([Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>public abstract [Logger](index.md)[withData](with-data.md)([Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)<br>Returns a new Logger instance with the associated data. Depending on the strategy this data may be logged with the message ormight be submitted as ancillary data to help with aggregations. |
| [withException](with-exception.md) | [common]<br>public abstract [Logger](index.md)[withException](with-exception.md)([Throwable](https://developer.android.com/reference/kotlin/java/lang/Throwable.html)e)<br>Returns a new Logger instance with the associated exception data. Depending on the strategy this data may be logged with the message or might be submitted as ancillary data to help with aggregations. |
| [withTag](with-tag.md) | [common]<br>public abstract [Logger](index.md)[withTag](with-tag.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag)<br>Returns a new Logger instance |

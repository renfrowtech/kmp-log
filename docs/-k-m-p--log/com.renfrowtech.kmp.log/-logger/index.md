//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[Logger](index.md)

# Logger

[common]\
interface [Logger](index.md)

Wrapper interface around logging various messages

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [alert](alert.md) | [common]<br>abstract fun [alert](alert.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs an alert error and optional tag |
| [critical](critical.md) | [common]<br>abstract fun [critical](critical.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs a critical error and optional tag |
| [debug](debug.md) | [common]<br>abstract fun [debug](debug.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs a debug message and optional tag |
| [emergency](emergency.md) | [common]<br>abstract fun [emergency](emergency.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs an emergency error and optional tag |
| [error](error.md) | [common]<br>abstract fun [error](error.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs an error and optional tag |
| [info](info.md) | [common]<br>abstract fun [info](info.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs an info message and optional tag |
| [notice](notice.md) | [common]<br>abstract fun [notice](notice.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs an notice message and optional tag |
| [trace](trace.md) | [common]<br>abstract fun [trace](trace.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs a verbose message and optional tag |
| [warning](warning.md) | [common]<br>abstract fun [warning](warning.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Logs a warning message and optional tag |
| [withData](with-data.md) | [common]<br>abstract fun [withData](with-data.md)(vararg data: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;): [Logger](index.md)<br>abstract fun [withData](with-data.md)(data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;): [Logger](index.md)<br>Returns a new Logger instance with the associated data. Depending on the strategy this data may be logged with the message ormight be submitted as ancillary data to help with aggregations. |
| [withException](with-exception.md) | [common]<br>abstract fun [withException](with-exception.md)(e: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Logger](index.md)<br>Returns a new Logger instance with the associated exception data. Depending on the strategy this data may be logged with the message or might be submitted as ancillary data to help with aggregations. |
| [withTag](with-tag.md) | [common]<br>abstract fun [withTag](with-tag.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [Logger](index.md)<br>Returns a new Logger instance |

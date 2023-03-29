//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[LogLevel](index.md)

# LogLevel

[common]\
enum [LogLevel](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)
&lt;[LogLevel](index.md)&gt;

Represents the different log levels available for logging. Depending on the LogStrategy
implementation, different log levels may be represented by the same system log level.

## Entries

| | |
|---|---|
| [EMERGENCY](-e-m-e-r-g-e-n-c-y/index.md) | [common]<br>[EMERGENCY](-e-m-e-r-g-e-n-c-y/index.md)<br>The highest log level. Used to indicate an emergency situation |
| [ALERT](-a-l-e-r-t/index.md) | [common]<br>[ALERT](-a-l-e-r-t/index.md)<br>The second highest log level. Used to indicate a situation where someone should be alerted |
| [CRITICAL](-c-r-i-t-i-c-a-l/index.md) | [common]<br>[CRITICAL](-c-r-i-t-i-c-a-l/index.md)<br>The third highest log level. Used to indicate a critical situation that should be dealt with quickly. |
| [ERROR](-e-r-r-o-r/index.md) | [common]<br>[ERROR](-e-r-r-o-r/index.md)<br>The fourth highest log level. Used to indicate an error case, typically an exception. |
| [WARNING](-w-a-r-n-i-n-g/index.md) | [common]<br>[WARNING](-w-a-r-n-i-n-g/index.md)<br>The fifth highest log level. Used to indicate a handled but unexpected case. |
| [NOTICE](-n-o-t-i-c-e/index.md) | [common]<br>[NOTICE](-n-o-t-i-c-e/index.md)<br>The sixth highest log level. Used to indicate a non-critical situation. |
| [INFO](-i-n-f-o/index.md) | [common]<br>[INFO](-i-n-f-o/index.md)<br>The seventh highest log level. Used to provide information that can be helpful. |
| [DEBUG](-d-e-b-u-g/index.md) | [common]<br>[DEBUG](-d-e-b-u-g/index.md)<br>The eighth highest log level. Used to aid in debugging a problem.. |
| [TRACE](-t-r-a-c-e/index.md) | [common]<br>[TRACE](-t-r-a-c-e/index.md)<br>The ninth highest and most verbose log level. Used to provide extremely detailed information. |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [common]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [LogLevel](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [common]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[LogLevel](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |

## Properties

| Name | Summary |
|---|---|
| [name](-t-r-a-c-e/index.md#-372974862%2FProperties%2F-747210664) | [common]<br>val [name](-t-r-a-c-e/index.md#-372974862%2FProperties%2F-747210664): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](-t-r-a-c-e/index.md#-739389684%2FProperties%2F-747210664) | [common]<br>val [ordinal](-t-r-a-c-e/index.md#-739389684%2FProperties%2F-747210664): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [printName](print-name.md) | [common]<br>val [printName](print-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [severity](severity.md) | [common]<br>val [severity](severity.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

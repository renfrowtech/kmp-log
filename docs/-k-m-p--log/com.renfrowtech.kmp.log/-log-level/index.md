//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[LogLevel](index.md)

# LogLevel

[common]\
public enum [LogLevel](index.md)
extends [Enum](https://developer.android.com/reference/kotlin/java/lang/Enum.html)
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
| [getName](index.md#-121241155%2FFunctions%2F-747210664) | [common]<br>public final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getName](index.md#-121241155%2FFunctions%2F-747210664)() |
| [getOrdinal](index.md#-353423263%2FFunctions%2F-747210664) | [common]<br>public final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getOrdinal](index.md#-353423263%2FFunctions%2F-747210664)() |
| [getPrintName](get-print-name.md) | [common]<br>public final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getPrintName](get-print-name.md)() |
| [getSeverity](get-severity.md) | [common]<br>public final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getSeverity](get-severity.md)() |
| [valueOf](value-of.md) | [common]<br>public final [LogLevel](index.md)[valueOf](value-of.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)value)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [common]<br>public final [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[LogLevel](index.md)&gt;[values](values.md)()<br>Returns an array containing the constants of this enum type, in the order they're declared. |

## Properties

| Name | Summary |
|---|---|
| [name](-t-r-a-c-e/index.md#-372974862%2FProperties%2F-747210664) | [common]<br>private final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[name](-t-r-a-c-e/index.md#-372974862%2FProperties%2F-747210664) |
| [ordinal](-t-r-a-c-e/index.md#-739389684%2FProperties%2F-747210664) | [common]<br>private final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[ordinal](-t-r-a-c-e/index.md#-739389684%2FProperties%2F-747210664) |
| [printName](-t-r-a-c-e/index.md#-21287245%2FProperties%2F-747210664) | [common]<br>private final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[printName](-t-r-a-c-e/index.md#-21287245%2FProperties%2F-747210664) |
| [severity](-t-r-a-c-e/index.md#-1780368686%2FProperties%2F-747210664) | [common]<br>private final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[severity](-t-r-a-c-e/index.md#-1780368686%2FProperties%2F-747210664) |

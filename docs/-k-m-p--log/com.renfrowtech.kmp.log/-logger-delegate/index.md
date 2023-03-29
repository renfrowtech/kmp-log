//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[LoggerDelegate](index.md)

# LoggerDelegate

[common]\
class [LoggerDelegate](index.md)
&lt;in [T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
&gt;(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? =
null) : [ReadOnlyProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)
&lt;[T](index.md), [Logger](../-logger/index.md)&gt;

Delegate for retrieving a [Logger](../-logger/index.md) implementation

## Constructors

| | |
|---|---|
| [LoggerDelegate](-logger-delegate.md) | [common]<br>constructor(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getValue](get-value.md) | [common]<br>open operator override fun [getValue](get-value.md)(thisRef: [T](index.md), property: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)&lt;*&gt;): [Logger](../-logger/index.md)<br>Delegate function Gets an instance of the Logger referencing the containing class |

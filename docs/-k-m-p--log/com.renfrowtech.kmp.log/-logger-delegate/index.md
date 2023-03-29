//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[LoggerDelegate](index.md)

# LoggerDelegate

[common]\
public final class [LoggerDelegate](index.md)&lt;T
extends [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;
implements [ReadOnlyProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)
&lt;[T](index.md), [Logger](../-logger/index.md)&gt;

Delegate for retrieving a [Logger](../-logger/index.md) implementation

## Constructors

| | |
|---|---|
| [LoggerDelegate](-logger-delegate.md) | [common]<br>public [LoggerDelegate](index.md)&lt;[T](index.md)&gt;[LoggerDelegate](-logger-delegate.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)tag) |

## Functions

| Name | Summary |
|---|---|
| [getValue](get-value.md) | [common]<br>public [Logger](../-logger/index.md)[getValue](get-value.md)([T](index.md)thisRef, [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)&lt;?&gt;property)<br>Delegate function Gets an instance of the Logger referencing the containing class |

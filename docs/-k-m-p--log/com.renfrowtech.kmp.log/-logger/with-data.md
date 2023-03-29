//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[Logger](index.md)
/[withData](with-data.md)

# withData

[common]\
abstract fun [withData](with-data.md)(vararg
data: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
?&gt;): [Logger](index.md)

abstract fun [withData](with-data.md)(
data: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)
&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)
, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)
?&gt;): [Logger](index.md)

Returns a new Logger instance with the associated data. Depending on the strategy this data may be
logged with the message ormight be submitted as ancillary data to help with aggregations.

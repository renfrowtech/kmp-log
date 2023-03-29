//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[Logger](index.md)
/[withData](with-data.md)

# withData

[common]\

public
abstract [Logger](index.md)[withData](with-data.md)([Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

public
abstract [Logger](index.md)[withData](with-data.md)([Map](https://developer.android.com/reference/kotlin/java/util/Map.html)
&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)
, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)&gt;data)

Returns a new Logger instance with the associated data. Depending on the strategy this data may be
logged with the message ormight be submitted as ancillary data to help with aggregations.

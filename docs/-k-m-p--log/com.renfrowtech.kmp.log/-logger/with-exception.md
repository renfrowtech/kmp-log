//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[Logger](index.md)
/[withException](with-exception.md)

# withException

[common]\
abstract fun [withException](with-exception.md)(
e: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Logger](index.md)

Returns a new Logger instance with the associated exception data. Depending on the strategy this
data may be logged with the message or might be submitted as ancillary data to help with
aggregations.

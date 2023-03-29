//[KMP-Log](../../../index.md)/[com.renfrowtech.kmp.log](../index.md)/[Logger](index.md)
/[withException](with-exception.md)

# withException

[common]\

public
abstract [Logger](index.md)[withException](with-exception.md)([Throwable](https://developer.android.com/reference/kotlin/java/lang/Throwable.html)
e)

Returns a new Logger instance with the associated exception data. Depending on the strategy this
data may be logged with the message or might be submitted as ancillary data to help with
aggregations.

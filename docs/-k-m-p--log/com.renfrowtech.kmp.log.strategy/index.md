//[KMP-Log](../../index.md)/[com.renfrowtech.kmp.log.strategy](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [LogcatStrategy](-logcat-strategy/index.md) | [android]<br>class [LogcatStrategy](-logcat-strategy/index.md)(val minLogLevel: LogLevel = LogLevel.INFO, val logSplitter: LogSplitter = LogcatSplitter()) : LogStrategy<br>Logging strategy for logging to Android Logcat |
| [LogStrategy](-log-strategy/index.md) | [common]<br>interface [LogStrategy](-log-strategy/index.md)<br>Wrapper interface around logging various messages to different locations (Logcat, Splunk, Crashlytics, Datadog, etc) |
| [PrintStrategy](-print-strategy/index.md) | [ios]<br>class [PrintStrategy](-print-strategy/index.md)(val minLogLevel: LogLevel = LogLevel.INFO, val logSplitter: LogSplitter = PrintSplitter()) : LogStrategy |

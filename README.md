# kmp-log

[![Version](https://img.shields.io/badge/Latest%20Version-0.1.2-white.svg)]()
[![Android API](https://img.shields.io/badge/Android%20API-21%2B-green.svg)](https://android-arsenal.com/api?level=23)
[![Android](https://img.shields.io/badge/Android-Alpha-orange.svg?logo=android&logoColor=white&labelColor=brightgreen)]()
[![iOS](https://img.shields.io/badge/iOS-Coming%20Soon-orange.svg?logo=apple&logoColor=white&labelColor=blue)]()
[![Linux](https://img.shields.io/badge/Linux-Coming%20Soon-red.svg?logo=linux&logoColor=white&labelColor=orange)]()
[![Windows](https://img.shields.io/badge/Windows-Coming%20Soon-red.svg?logo=windows&logoColor=white&labelColor=purple)]()
[![MacOS](https://img.shields.io/badge/MacOS-Coming%20Soon-red.svg?logo=apple&logoColor=white&labelColor=darkblue)]()
[![JVM](https://img.shields.io/badge/JVM-Coming%20Soon-red.svg?logo=coffeescript&logoColor=white&labelColor=darkred)]()
[![License](https://img.shields.io/badge/License-Apache%202.0-lightgrey.svg)](https://opensource.org/licenses/Apache-2.0)

Configurable Logging framework built for Kotlin Multiplatform

# Documentation

Full documentation of the Logging framework is available in the [documentation](docs/index.md)

# Getting Started

## Multiplatform

### Gradle

Add the Maven Central repository if it's not already there:

```kotlin
repositories {
    mavenCentral()
}
```

Kotlin DSL (see badges for platform support)

```kotlin
commonMain {
    dependencies {
        implementation("com.renfrowtech:kmp-log:<latest-version>")
    }
}
```

## Android

### Gradle

Add the Maven Central repository if it's not already there:

```kotlin
repositories {
    mavenCentral()
}
```

Groovy

``` groovy
implementation "com.renfrowtech:kmp-log-android:<latest-version>"
```

Kotlin DSL

```kotlin
implementation("com.renfrowtech:kmp-log:<latest-version>")
```

### Implementation

#### Add Log Strategies

In a global scope, specify the implementations of the `LoggingStrategy` interface to be used for
logging.

```kotlin
// The built in implementation of the `LoggingStrategy` interface for logging to Logcat 
Logger.addStrategies(LogcatStrategy())

// The same implementation, specifying the minimum logging level
Logger.addStrategies(LogcatStrategy(minLogLevel = LogLevel.DEBUG))

// A custom LoggingStrategy implementation
Logger.addStrategies(CustomLogStrategy())
```

#### Get a logger instance

In any class, use the `LoggerDelegate` to get a logger instance

```kotlin
class Foo {
    val logger by LoggerDelegate(/*Optionally provide TAG string here, otherwise it will be derived from the class name*/)
    
    //...
}
```

#### Log a message

```kotlin
class MainActivity { // Can be any class
    fun foo() {
        //...
        logger.info("Hello world!")
        //...
    }
}
```

#### Add data to a log

To add data to the log statement use the `withData` function and provide a series (vararg) of Pair<
String, Any?> or a Map<String, Any?>

```kotlin
class MainActivity { // Can be any class
    fun foo(something: Int) {
        //...
        logger
            .withData("something" to something)
            .info("In foo!")
        //...
    }
}
```

#### Add exception to a log

To add exception to the log statement use the `withException` function

```kotlin
class Foo {
    fun bar(someParam: String) {
        //...
        try {
            // Do something that can throw an exception
        } catch (e: Exception) {
            logger
                .withData("something" to e.message)
                .withException(e)
                .error("Something went wrong in foo") // Any level log is ok here
        }
        //...
    }
}
```

Note that you can mix `withData` and `withException`

If you want the same data included in multiple logs, capture the logger returned from `withData`
or `withException`

```kotlin
val loggerWithSomething = logger.withData("something" to something)

loggerWithSomething.trace("Detailed information")
```

###
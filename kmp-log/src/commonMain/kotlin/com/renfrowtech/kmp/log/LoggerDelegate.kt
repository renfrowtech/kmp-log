package com.renfrowtech.kmp.log

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

/**
 * Delegate for retrieving a [Logger] implementation
 */
@Suppress("unused")
class LoggerDelegate<in T : Any>(private val tag: String? = null) : ReadOnlyProperty<T, Logger> {

    /**
     * Delegate function
     * Gets an instance of the Logger referencing the containing class
     *
     * @param thisRef
     * @param property
     * @return
     */
    override operator fun getValue(thisRef: T, property: KProperty<*>): Logger {
        return getLoggerFor(thisRef::class)
    }

    companion object {
        internal fun getLoggerFor(
            clazz: KClass<*>,
            loggingTag: String? = null
        ): Logger = run {
            val strats = Logger.strats
            val props = listOfNotNull(
                KEY_CLASS_NAME to clazz.simpleName,
                if (loggingTag != null)
                    (KEY_COMPONENT to loggingTag)
                else
                    null
            )

            return ModularLogger(
                strats,
                loggingTag,
                props
            )
        }
    }
}
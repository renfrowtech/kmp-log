package com.renfrowtech.kmp.log.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.renfrowtech.kmp.log.LoggerDelegate

class MainActivity : AppCompatActivity() {

    private val logger by LoggerDelegate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foo(5)
    }

    @Suppress("SameParameterValue")
    private fun foo(something: Int) {
        logger
            .withData("something" to something)
            .info("In foo!")

        try {
            // Do something that can throw an exception
        } catch (e: Exception) {
            logger
                .withData("something" to e.message)
                .withException(e)
                .error("Something went wrong in foo") // Any level log is ok here
        }

        val loggerWithSomething = logger.withData("something" to something)

        loggerWithSomething.trace("Detailed information")
    }

}
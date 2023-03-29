package com.renfrowtech.kmp.log.app

import android.app.Application
import com.renfrowtech.kmp.log.Logger
import com.renfrowtech.kmp.log.strategy.LogcatStrategy

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Logger.addStrategies(LogcatStrategy())

    }
}
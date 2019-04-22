package com.di.koinKodin.koin

import android.app.Application
import com.di.koinKodin.koin.DI.PlayerModule
import org.koin.android.ext.android.startKoin

class KoinDIClass : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(PlayerModule.playerObject))

    }
}
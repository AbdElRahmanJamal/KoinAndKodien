package com.di.koinKodin.kodin

import android.app.Application
import com.di.koinKodin.Nationality
import com.di.koinKodin.NeedContextClass
import com.di.koinKodin.Players
import com.di.koinKodin.Team
import org.kodein.di.Kodein
import org.kodein.di.KodeinContext
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

object KodienModule {
    val needContextClassObject = Kodein.lazy {
        import(androidXModule(Application()))
        bind() from provider { Nationality("", 0) }
        bind() from provider { Team("", instance()) }
        bind() from provider { Players("Salah", instance()) }
        bind() from provider { NeedContextClass(instance(), instance()) }

    }
}
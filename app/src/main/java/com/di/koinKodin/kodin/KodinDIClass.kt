package com.di.koinKodin.kodin

import android.app.Application
import com.di.koinKodin.Nationality
import com.di.koinKodin.NeedContextClass
import com.di.koinKodin.Players
import com.di.koinKodin.Team
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

class KodinDIClass : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@KodinDIClass))//to return  instance of context or anything related to android
        bind() from provider { Nationality("", 0) }
        bind() from provider { Team("", instance()) }
        bind() from provider { Players("Mane", instance()) }
        bind() from provider { NeedContextClass(instance(), instance()) }

    }
}
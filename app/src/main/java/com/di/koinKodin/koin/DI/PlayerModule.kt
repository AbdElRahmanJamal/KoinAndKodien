package com.di.koinKodin.koin.DI

import com.di.koinKodin.Nationality
import com.di.koinKodin.NeedContextClass
import com.di.koinKodin.Players
import com.di.koinKodin.Team
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

object PlayerModule {

    val playerObject: Module = module {
        factory { Nationality(name = getProperty("Nationality"), flag = getProperty("NationalityFlag")) }
        factory { Team(teamName = getProperty("TeamName"), teamNationality = get()) }
        factory { Players(name = getProperty("PlayerName"), team = get()) }
        factory { NeedContextClass(koinContext.get(), get()) }
    }

}

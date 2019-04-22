package com.di.koinKodin.koin.DI

import com.di.koinKodin.DependencyClass
import com.di.koinKodin.IDataInterface
import com.di.koinKodin.SingleData
import com.di.koinKodin.SomeData
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

object InterfaceDI {
    val InterfaceDIObject: Module = module {
        factory<IDataInterface>(name = "SomeData", override = true) { SomeData() }
        factory<IDataInterface>(name = "SingleData", override = true) { SingleData() }
        factory { DependencyClass(iDataInterface = get(getProperty("MyClass"))) }
    }
}

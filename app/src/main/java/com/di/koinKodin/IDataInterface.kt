package com.di.koinKodin

interface IDataInterface {
    fun printHelloFromInterfaceImp():String
}

class SomeData : IDataInterface {
    override fun printHelloFromInterfaceImp():String {
        return "Best Defender in the WORLD <3"
    }

}


class SingleData : IDataInterface {
    override fun printHelloFromInterfaceImp(): String {
        return "IS The Best<3"
    }
}

class DependencyClass(val iDataInterface: IDataInterface) {
    fun printFromClass():String {
       return iDataInterface.printHelloFromInterfaceImp()
    }
}
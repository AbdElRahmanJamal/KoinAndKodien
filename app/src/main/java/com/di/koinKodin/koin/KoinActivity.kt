package com.di.koinKodin.koin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.di.koinKodin.DependencyClass
import com.di.koinKodin.NeedContextClass
import com.di.koinKodin.R
import com.di.koinKodin.koin.DI.InterfaceDI
import com.di.koinKodin.koin.DI.PlayerModule
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get
import org.koin.android.ext.android.setProperty
import org.koin.android.ext.android.startKoin
import org.koin.standalone.StandAloneContext.stopKoin

class KoinActivity : AppCompatActivity() {
    /*
    * 2 wat to use codin
    * 1 in application class create app class and put this line into it
    *         startKoin(this, listOf(PlayerModule.playerObject))
              then use it val players: Players by inject()
              now u have object of player u can set property
    *
    * 2 delete app class
        put it n ur activity or fragment
        startKoin(this, listOf(PlayerModule.playerObject))
        players = get()
        now u have object of player u can set property
     */
    //lateinit var players: Players
//    val players: Players by inject()
    lateinit var needContextClass: NeedContextClass
    lateinit var dependencyClass: DependencyClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startKoin(this, listOf(PlayerModule.playerObject, InterfaceDI.InterfaceDIObject))
        //used to set some property in run time
        setProperty("Nationality", "England")
        setProperty("NationalityFlag", 1)
        setProperty("TeamName", "Liverpool")
        setProperty("PlayerName", "Van Dijk")

        needContextClass = get()
        player.text = needContextClass.players.name

        setProperty("MyClass", "SingleData")
        dependencyClass = get()

        player.text ="${player.text} ${dependencyClass.printFromClass()}"
        stopKoin()

    }
}

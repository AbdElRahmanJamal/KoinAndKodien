package com.di.koinKodin.kodin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.di.koinKodin.NeedContextClass
import com.di.koinKodin.R
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.generic.instance

class KodinActivity : AppCompatActivity() {


    private val needContextClass: NeedContextClass by KodienModule.needContextClassObject.instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        player.text = needContextClass.players.name
    }
}

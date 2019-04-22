package com.di.koinKodin

import android.content.Context

data class Players(val name: String, val team: Team)
data class Team(val teamName: String, val teamNationality: Nationality)
data class Nationality(val name: String, val flag: Int)
data class NeedContextClass(val context: Context,val players: Players)

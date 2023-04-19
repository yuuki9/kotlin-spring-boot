package com.egis.app.domain.crew.payload.request

data class CrewRequest(
    val name: String,
    val nickName:String,
    val tier: String,
    val sex : String
)

data class UpdateEloRequest(
    val elo : Long
)
package com.egis.app.domain.crew.payload.request

data class CrewRequest(
    val name: String,
    val tier: String,
    val sex : String
)

data class UpdateEloRequest(
    val name: String,
    val elo : Number
)
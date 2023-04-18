package com.egis.app.domain.crew.payload.response


data class CrewInfoResponse(
    val id: Long,
    val name: String,
    val sex: String,
    val tier: String,
    val elo:Number,
)

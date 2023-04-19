package com.egis.app.domain.crew.payload.response


data class CrewResponse(
    val id: Long,
    val name: String,
    val nickName:String,
    val sex: String,
    val tier: String,
    val elo:Number,
)

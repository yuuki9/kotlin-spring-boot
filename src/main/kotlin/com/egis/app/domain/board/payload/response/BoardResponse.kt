package com.egis.app.domain.board.payload.response

data class BoardResponse(
    val bno: Long,
    val deck: String,
    val message: String,
    val winner: String,
    val name: String,
    val date: String
)
package com.egis.app.domain.board.payload.request

data class BoardRequest(
    val deck: String,
    val message: String,
    val name : String,
    val date : String
)
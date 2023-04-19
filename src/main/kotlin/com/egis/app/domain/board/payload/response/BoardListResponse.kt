package com.egis.app.domain.board.payload.response

import com.egis.app.domain.crew.payload.response.CrewResponse

data class BoardListResponse(
    val list: List<BoardResponse>
)
package com.egis.app.domain.board.controller

import com.egis.app.domain.board.entity.Board
import com.egis.app.domain.board.payload.request.BoardRequest
import com.egis.app.domain.board.service.BoardService
import com.egis.app.domain.crew.entity.Crew
import com.egis.app.domain.crew.payload.request.CrewRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class BoardController(
    private val boardService: BoardService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveCrew(@RequestBody request : BoardRequest): Board {
        return boardService.save(request)
    }

}
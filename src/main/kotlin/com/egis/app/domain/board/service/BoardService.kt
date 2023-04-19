package com.egis.app.domain.board.service

import com.egis.app.domain.board.entity.Board
import com.egis.app.domain.board.payload.request.BoardRequest
import com.egis.app.domain.board.payload.response.BoardListResponse
import com.egis.app.domain.board.payload.response.BoardResponse
import com.egis.app.domain.board.repository.BoardRepository
import com.egis.app.domain.crew.repository.CrewRepository
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardRepository: BoardRepository,
    private val crewRepository: CrewRepository
) {

    fun getBoardList(): BoardListResponse {
        val list: List<BoardResponse> = boardRepository.findAll()
            .map {
                BoardResponse(
                    bno = it.bno,
                    deck = it.deck,
                    message = it.message,
                    name = it.name.toString(),
                    winner = it.winner.toString(),
                    date = it.date
                )
            }
            .toList()
        return BoardListResponse(
            list = list
        )
    }

    fun save(request: BoardRequest): Board {
        val crew = crewRepository.findByName(request.name)
        val board = Board(
            deck = request.deck,
            message = request.message,
            winner = crew.nickName.toString(),
            name = crew.name.toString(),
            date = request.date
        )

        return boardRepository.save(board)
    }
}
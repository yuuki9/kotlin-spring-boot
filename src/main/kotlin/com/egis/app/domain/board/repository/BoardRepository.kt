package com.egis.app.domain.board.repository

import com.egis.app.domain.board.entity.Board
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository : CrudRepository<Board, Long> {

    override fun findAll(): List<Board> {
        TODO("Not yet implemented")
    }
}
package com.egis.app.domain.crew.repository

import com.egis.app.domain.crew.entity.Crew
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CrewRepository : CrudRepository<Crew, Long> {
    override fun findAll(): List<Crew> {
        TODO("Not yet implemented")
    }

    fun findByName(name: String): Crew {
        TODO("Not yet implemented")
    }
}
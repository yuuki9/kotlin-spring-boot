package com.egis.app.domain.crew.service

import com.egis.app.domain.crew.entity.Crew
import com.egis.app.domain.crew.payload.request.CrewRequest
import com.egis.app.domain.crew.payload.request.UpdateEloRequest
import com.egis.app.domain.crew.payload.response.CrewListResponse
import com.egis.app.domain.crew.payload.response.CrewResponse
import com.egis.app.domain.crew.repository.CrewRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class CrewService {
    private val crewRepository: CrewRepository
        get() {
            TODO()
        }

    fun getCrewList() : CrewListResponse {
        val list: List<CrewResponse> = crewRepository.findAll()
            .map {
                CrewResponse(
                    id = it.id,
                    name = it.name,
                    tier = it.tier,
                    sex = it.sex,
                    elo = it.elo
                )
            }
            .toList()
        return CrewListResponse(
           crewList = list
        )
    }

    fun save(request: CrewRequest) : Crew {
        val crew = Crew(
            name = request.name,
            tier = request.tier,
            sex = request.sex,
            elo = 2400
        )
        return crewRepository.save(crew)
    }

    @Transactional
    fun updateByElo(request : UpdateEloRequest) : CrewResponse {
        val crew : Crew = crewRepository.findByName(request.name)
        crew.update(
            elo = request.elo
        )

        return CrewResponse(
            id = crew.id,
            name = crew.name,
            sex = crew.sex,
            tier = crew.tier,
            elo = crew.elo
        )
    }

}
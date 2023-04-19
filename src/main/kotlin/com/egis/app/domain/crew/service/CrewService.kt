package com.egis.app.domain.crew.service

import com.egis.app.domain.crew.entity.Crew
import com.egis.app.domain.crew.payload.request.CrewRequest
import com.egis.app.domain.crew.payload.request.UpdateEloRequest
import com.egis.app.domain.crew.payload.response.CrewListResponse
import com.egis.app.domain.crew.payload.response.CrewResponse
import com.egis.app.domain.crew.repository.CrewRepository
import org.springframework.stereotype.Service
import java.util.Optional
import javax.transaction.Transactional

@Service
class CrewService(
    private val crewRepository: CrewRepository

) {
    fun getCrewList() : CrewListResponse {
        val list: List<CrewResponse> = crewRepository.findAll()
            .map {
                CrewResponse(
                    id = it.id,
                    name = it.name,
                    nickName = it.nickName,
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
            nickName = request.nickName,
            tier = request.tier,
            sex = request.sex,
            elo = 2400
        )
        return crewRepository.save(crew)
    }

    @Transactional
    fun updateByElo(crewId: Long ,request : UpdateEloRequest) : CrewResponse {
        val crew : Optional<Crew> = crewRepository.findById(crewId)
        crew.get().update(
            elo = request.elo
        )

        return CrewResponse(
            id = crew.get().id,
            nickName = crew.get().nickName,
            name = crew.get().name,
            sex = crew.get().sex,
            tier = crew.get().tier,
            elo = crew.get().elo
        )
    }

    fun deleteById(crewId : Long) : CrewResponse {
        val crew : Optional<Crew> = crewRepository.findById(crewId)
        crewRepository.delete(crew.get())

        return CrewResponse(
            id = crew.get().id,
            nickName = crew.get().nickName,
            tier = crew.get().tier,
            name = crew.get().name,
            sex = crew.get().sex,
            elo = crew.get().elo
        )
    }



}
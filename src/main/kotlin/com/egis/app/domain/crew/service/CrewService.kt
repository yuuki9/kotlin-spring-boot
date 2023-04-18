package com.egis.app.domain.crew.service

import com.egis.app.domain.crew.entity.Crew
import com.egis.app.domain.crew.payload.response.CrewInfoResponse

class CrewService {

    fun getCrewList() : CrewInfoResponse {
       val crew = Crew(
           name = "22년생미드라이너",
           tier = "platinum",
           sex = "man",
           elo = 2400
       )
        return CrewInfoResponse(
            id = 0,
            name = crew.name,
            tier = crew.tier,
            sex = crew.sex,
            elo = crew.elo
        )
    }

}
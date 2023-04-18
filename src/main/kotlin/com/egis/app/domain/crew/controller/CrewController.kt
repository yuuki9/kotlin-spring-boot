package com.egis.app.domain.crew.controller

import com.egis.app.domain.crew.payload.response.CrewInfoResponse
import com.egis.app.domain.crew.service.CrewService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/crew")
class CrewController {

    private lateinit var crewService: CrewService

    @GetMapping("/list")
    fun getCrewList(): CrewInfoResponse {
        return  crewService.getCrewList()
    }

}
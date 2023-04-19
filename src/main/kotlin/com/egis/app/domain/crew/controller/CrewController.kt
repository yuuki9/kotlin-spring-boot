package com.egis.app.domain.crew.controller

import com.egis.app.domain.crew.entity.Crew
import com.egis.app.domain.crew.payload.request.CrewRequest
import com.egis.app.domain.crew.payload.response.CrewListResponse
import com.egis.app.domain.crew.service.CrewService
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus

@Controller
@RequestMapping("/crew")
class CrewController {

    private lateinit var crewService: CrewService

    @GetMapping("/lists")
    fun getCrewList(): CrewListResponse {
        return  crewService.getCrewList()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveCrew(@RequestBody request : CrewRequest): Crew {
        return crewService.save(request)
    }

    @DeleteMapping("/delete")
    fun deleteCrew() {

    }

}
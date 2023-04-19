package com.egis.app.domain.crew.controller

import com.egis.app.domain.crew.entity.Crew
import com.egis.app.domain.crew.payload.request.CrewRequest
import com.egis.app.domain.crew.payload.request.UpdateEloRequest
import com.egis.app.domain.crew.payload.response.CrewListResponse
import com.egis.app.domain.crew.payload.response.CrewResponse
import com.egis.app.domain.crew.service.CrewService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/crew")
class CrewController (
    private var crewService: CrewService
){
    @GetMapping("/lists")
    fun getCrewList(): CrewListResponse {
        return  crewService.getCrewList()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveCrew(@RequestBody request : CrewRequest): Crew {
        return crewService.save(request)
    }

    @PatchMapping("/{crew-id}")
    fun updateElo(@PathVariable("crew-id") crewId: Long , @RequestBody request : UpdateEloRequest) : CrewResponse {
        return crewService.updateByElo(crewId , request)
    }

    @DeleteMapping("/{crew-id}")
    fun deleteCrew(@PathVariable("crew-id") crewId: Long) : CrewResponse {
        return crewService.deleteById(crewId)

    }

}
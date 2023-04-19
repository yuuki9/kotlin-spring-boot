package com.egis.app.domain.crew.entity

import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
@Entity
class Crew(
    name:String,
    tier:String,
    sex:String,
    elo:Number
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0;

    var name = name
        protected set

    var tier = tier
        protected set

    var sex = sex
        protected set

    var elo = elo
        protected set

    fun update(elo: Number): Crew {
        this.elo = elo
        return this
    }
}
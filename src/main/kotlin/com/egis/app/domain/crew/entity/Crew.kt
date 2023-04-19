package com.egis.app.domain.crew.entity

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
class Crew(
    name:String,
    nickName:String,
    tier:String,
    sex:String,
    elo:Long
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crew_id")
    val id: Long = 0;

    @Column(name = "crew_name")
    var name = name
        protected set

    @Column(name = "crew_nickname")
    var nickName = nickName
        protected  set
    @Column(name = "crew_tier")
    var tier = tier
        protected set

    @Column(name = "crew_sex")
    var sex = sex
        protected set

    @Column(name = "crew_elo")
    var elo = elo
        protected set

    fun update(elo: Long): Crew {
        this.elo = elo
        return this
    }
}
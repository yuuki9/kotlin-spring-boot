package com.egis.app.domain.board.entity

import javax.persistence.*

@Entity
class Board(
    deck:String,
    message:String,
    @ManyToOne
    @JoinColumn(name = "crew_nickname")
    val winner: String,
    @ManyToOne
    @JoinColumn(name = "crew_name")
    val name: String,
    date: String
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bno")
    val bno: Long = 0;
    @Column(name = "title")
    var deck = deck
        protected set

    @Column(name = "content")
    var message = message
        protected  set

    @Column(name = "date")
    var date = date
        protected  set


}
package com.egis.app.egisclub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EgisClubApplication

fun main(args: Array<String>) {
	println("이지스의 동아리 매니지먼트 어플리케이션입니다.")
	runApplication<EgisClubApplication>(*args)
}

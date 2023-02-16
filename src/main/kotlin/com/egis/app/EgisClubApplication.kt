package com.egis.app

import com.egis.app.global.exception.CustomException
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EgisClubApplication

fun main(args: Array<String>) {

	runApplication<EgisClubApplication>(*args)
	try{
		println("이지스의 동아리 매니지먼트 어플리케이션입니다.")
	} catch (e: Exception){
		when(e){
			is CustomException -> "서버에러발생"
			else -> println("서버에러발생")
		}
	}
}

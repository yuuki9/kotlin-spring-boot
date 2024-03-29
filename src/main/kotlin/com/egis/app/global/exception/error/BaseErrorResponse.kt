package com.egis.app.global.exception.error

import com.egis.app.global.exception.CustomException

class BaseErrorResponse(
        val status:Int,
        val message:String
) {
    companion object{
        fun of(e: CustomException): BaseErrorResponse{
            return BaseErrorResponse(
                status = e.status,
                message = e.message
            )
        }
    }
}
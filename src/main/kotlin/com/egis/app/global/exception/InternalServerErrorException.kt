package com.egis.app.global.exception

import com.egis.app.global.exception.error.GlobalErrorCode

class InternalServerErrorException private constructor() : CustomException(GlobalErrorCode.INTERNAL_SERVER_ERROR){
    companion object{
        @JvmField
        val Exception = InternalServerErrorException();
    }
}
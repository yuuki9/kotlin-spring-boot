package com.egis.app.global.exception

import com.egis.app.global.exception.error.ErrorResponse
import java.lang.RuntimeException

open class CustomException(private val error: ErrorResponse) : RuntimeException() {
    val status : Int
        get() = error.status
    override val message: String
        get() = error.message
}
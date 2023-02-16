package com.egis.app.global.exception.error

interface ErrorResponse {
    val status: Int
    val message: String
}
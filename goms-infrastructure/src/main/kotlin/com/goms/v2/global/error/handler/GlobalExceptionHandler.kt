package com.goms.v2.global.error.handler

import com.goms.v2.global.error.exception.GomsException
import com.goms.v2.global.error.response.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

	@ExceptionHandler(GomsException::class)
	fun handler(e: GomsException): ResponseEntity<ErrorResponse> =
		ResponseEntity(
			ErrorResponse(e.errorCode.message, e.errorCode.status.value()),
			HttpStatus.valueOf(e.errorCode.status.name)
		)

}
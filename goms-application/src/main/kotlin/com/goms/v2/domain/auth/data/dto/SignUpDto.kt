package com.goms.v2.domain.auth.data.dto

import com.goms.v2.domain.account.constant.Gender

data class SignUpDto(
    val phoneNumber: String,
    val password: String,
    val name: String,
    val grade: Int,
    val gender: Gender
)
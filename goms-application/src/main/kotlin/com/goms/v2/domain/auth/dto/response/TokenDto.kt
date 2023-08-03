package com.goms.v2.domain.auth.dto.response

import com.goms.v2.domain.account.Authority

data class TokenDto(
    val accessToken: String,
    val refreshToken: String,
    val accessTokenExp: Int,
    val refreshTokenExp: Int,
    val authority: Authority
)

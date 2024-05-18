package com.joaoandrade.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.example.mlp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
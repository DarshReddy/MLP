package com.project.mlp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
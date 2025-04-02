package com.jdev.rickmortyapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
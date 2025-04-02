package com.jdev.rickmortyapp

import androidx.compose.ui.window.ComposeUIViewController
import com.jdev.rickmortyapp.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }
package com.jdev.rickmortyapp.di

import com.jdev.rickmortyapp.ui.home.tabs.characters.CharactersViewModel
import com.jdev.rickmortyapp.ui.home.tabs.episodes.EpisodesViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val uiModule = module {
    viewModelOf(::EpisodesViewModel)
    viewModelOf(::CharactersViewModel)
}
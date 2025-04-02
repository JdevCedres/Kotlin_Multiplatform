package com.jdev.rickmortyapp.ui.home.tabs.characters

import com.jdev.rickmortyapp.domain.model.CharacterModel

data class CharactersState(
    val characterOfTheDay:CharacterModel? = null
)
package com.jdev.rickmortyapp.ui.home.tabs.characters

import androidx.paging.PagingData
import com.jdev.rickmortyapp.domain.model.CharacterModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class CharactersState(
    val characterOfTheDay:CharacterModel? = null,
    val characters: Flow<PagingData<CharacterModel>> = emptyFlow()
)
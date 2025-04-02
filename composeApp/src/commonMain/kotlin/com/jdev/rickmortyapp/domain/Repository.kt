package com.jdev.rickmortyapp.domain

import com.jdev.rickmortyapp.domain.model.CharacterModel

interface Repository {
    suspend fun getSingleCharacter(id:String):CharacterModel
}
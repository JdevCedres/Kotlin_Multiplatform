package com.jdev.rickmortyapp.domain

import com.jdev.rickmortyapp.domain.model.CharacterModel

class GetRandomCharacter(private val repository: Repository) {

    private val random:Int = (1..826).random()
    suspend operator fun invoke(): CharacterModel {
       return repository.getSingleCharacter(random.toString())
    }
}
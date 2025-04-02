package com.jdev.rickmortyapp.data

import com.jdev.rickmortyapp.data.remote.ApiService
import com.jdev.rickmortyapp.domain.Repository
import com.jdev.rickmortyapp.domain.model.CharacterModel




class RepositoryImpl(private val api: ApiService):Repository {
    override suspend fun getSingleCharacter(id: String):CharacterModel {
       return api.getSingleCharacter(id).toDomain()
    }
}
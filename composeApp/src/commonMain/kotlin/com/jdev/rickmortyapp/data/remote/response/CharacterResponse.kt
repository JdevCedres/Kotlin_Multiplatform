package com.jdev.rickmortyapp.data.remote.response

import com.jdev.rickmortyapp.domain.model.CharacterModel
import kotlinx.serialization.Serializable



@Serializable
data class CharacterResponse(
    val id: Int,
    val status: String,
    val image: String
) {
    // Esta función 'toDomain' convierte el objeto de la API (CharacterResponse) a un modelo de dominio (CharacterModel)
    fun toDomain(): CharacterModel {
        return CharacterModel(
            id = id,
            image = image,
            isAlive = status.lowercase() == "alive"
        )
    }
}

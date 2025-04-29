package com.jdev.rickmortyapp.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.jdev.rickmortyapp.data.database.entity.CharacterOfTheDayEntity


@Dao
interface UserPreferencesDAO {
    @Query("SELECT * FROM characteroftheday")
    suspend fun getCharacterOfTheDayDB():CharacterOfTheDayEntity?

}
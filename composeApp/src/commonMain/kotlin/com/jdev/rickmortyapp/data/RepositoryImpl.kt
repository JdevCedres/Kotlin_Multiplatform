package com.jdev.rickmortyapp.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.jdev.rickmortyapp.data.database.RickMortyDatabase
import com.jdev.rickmortyapp.data.remote.ApiService
import com.jdev.rickmortyapp.data.remote.paging.CharactersPagingSource
import com.jdev.rickmortyapp.domain.Repository
import com.jdev.rickmortyapp.domain.model.CharacterModel
import kotlinx.coroutines.flow.Flow


class RepositoryImpl(
    private val api: ApiService,
    private val charactersPagingSource: CharactersPagingSource,
    private val rickMortyDatabase: RickMortyDatabase
) : Repository {
    companion object {
        const val MAX_ITEMS = 20
        const val PREFETCH_ITEMS = 5
    }

    override suspend fun getSingleCharacter(id: String): CharacterModel {
        return api.getSingleCharacter(id).toDomain()
    }

    override fun getAllCharacters(): Flow<PagingData<CharacterModel>> {
        return Pager(
            config = PagingConfig(pageSize = MAX_ITEMS, prefetchDistance = PREFETCH_ITEMS),
            pagingSourceFactory = { charactersPagingSource }).flow
    }

    override suspend fun getCharacterDB() {
        rickMortyDatabase.getPreferencesDao().getCharacterOfTheDayDB()
    }
}
package com.jdev.rickmortyapp.di

import com.jdev.rickmortyapp.data.database.RickMortyDatabase
import com.jdev.rickmortyapp.data.database.getDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module {
   return module {
        single<RickMortyDatabase>{ getDatabase()}
    }
}
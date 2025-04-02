package com.jdev.rickmortyapp.di

import com.jdev.rickmortyapp.domain.GetRandomCharacter
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val domainModule = module {
    factoryOf(::GetRandomCharacter)
}
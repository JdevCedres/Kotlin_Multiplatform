package com.jdev.rickmortyapp.di

import com.jdev.rickmortyapp.data.RepositoryImpl
import com.jdev.rickmortyapp.data.remote.ApiService
import com.jdev.rickmortyapp.data.remote.paging.CharactersPagingSource
import com.jdev.rickmortyapp.domain.Repository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val dataModule = module {
    single {
        HttpClient {
            install(ContentNegotiation){
                json(json = Json{ ignoreUnknownKeys = true }, contentType = ContentType.Any)
            }
            install(DefaultRequest){
                url {
                    protocol = URLProtocol.HTTPS
                    host = "rickandmortyapi.com"
//                    parameters.append("key", value = "") si tuviera o tuviese apikey
                }
            }
        }
    }
    factoryOf(::ApiService)
    factory<Repository>{ RepositoryImpl(get(),get(), get()) }
    factoryOf(::CharactersPagingSource)
}
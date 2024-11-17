package gaur.himanshu.apiintegration.data.di

import gaur.himanshu.apiintegration.data.remote.ApiService
import gaur.himanshu.apiintegration.data.remote.KtorClient
import gaur.himanshu.apiintegration.data.repository.PostsRepoImpl
import gaur.himanshu.apiintegration.domain.repository.PostsRepository
import org.koin.dsl.module

val dataModule = module {
    factory { KtorClient.client }
    factory { ApiService(get()) }
    factory<PostsRepository> { PostsRepoImpl(get()) }
}
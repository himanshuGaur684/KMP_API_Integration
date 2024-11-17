package gaur.himanshu.apiintegration.domain.di

import gaur.himanshu.apiintegration.domain.use_case.GetPostsUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetPostsUseCase(get()) }
}
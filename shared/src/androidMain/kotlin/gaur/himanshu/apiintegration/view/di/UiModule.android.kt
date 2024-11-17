package gaur.himanshu.apiintegration.view.di

import gaur.himanshu.apiintegration.view.PostsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

private val viewModelModule = module {
    viewModel { PostsViewModel(get()) }
}

actual fun sharedViewModelModule(): Module = viewModelModule
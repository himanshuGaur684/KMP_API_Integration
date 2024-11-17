package gaur.himanshu.apiintegration.view.di

import gaur.himanshu.apiintegration.view.PostsViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.module.Module
import org.koin.dsl.module

private val viewModelModule = module {
    single { PostsViewModel(get()) }
}

actual fun sharedViewModelModule(): Module = viewModelModule

object ProvideViewModel : KoinComponent{

    fun getPostsViewModel():PostsViewModel = get()

}

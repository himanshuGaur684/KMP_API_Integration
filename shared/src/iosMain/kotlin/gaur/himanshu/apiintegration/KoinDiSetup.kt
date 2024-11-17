package gaur.himanshu.apiintegration

import gaur.himanshu.apiintegration.data.di.dataModule
import gaur.himanshu.apiintegration.domain.di.domainModule
import gaur.himanshu.apiintegration.view.di.sharedViewModelModule
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(dataModule + domainModule + sharedViewModelModule())
    }
}
package gaur.himanshu.apiintegration

import android.app.Application
import gaur.himanshu.apiintegration.data.di.dataModule
import gaur.himanshu.apiintegration.domain.di.domainModule
import gaur.himanshu.apiintegration.view.di.sharedViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules(dataModule + domainModule + sharedViewModelModule())
        }
    }

}
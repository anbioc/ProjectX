package com.alphacoder.app

import com.alphacoder.di.AppComponent
import com.alphacoder.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApp: DaggerApplication() {
    private val appComponent: AppComponent by lazy{
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        // do nothing
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        appComponent
}
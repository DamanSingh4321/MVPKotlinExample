package com.singh.daman.mvpkotlinexample.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by Daman on 2/4/2018.
 */

@Module
class AppModule {
    private lateinit var application: Application

    fun AppModule(application: Application) {
        this.application = application
    }

    @Provides
    fun provideContext(): Context {
        return application
    }

    @Provides
    fun provideApplication(): Application {
        return application
    }
}
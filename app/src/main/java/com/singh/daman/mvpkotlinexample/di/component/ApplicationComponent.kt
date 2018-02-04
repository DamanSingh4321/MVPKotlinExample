package com.singh.daman.mvpkotlinexample.di.component

import android.app.Application
import android.content.Context
import com.singh.daman.mvpkotlinexample.InitApp
import com.singh.daman.mvpkotlinexample.di.module.AppModule
import com.singh.daman.mvpkotlinexample.di.module.NetModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Daman on 2/4/2018.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, NetModule::class))
interface ApplicationComponent {

    fun inject(initApp: InitApp)
    fun getContext() : Context
    fun getApplication() : Application

}
package com.singh.daman.mvpkotlinexample

import android.app.Application
import android.content.Context
import com.singh.daman.mvpkotlinexample.di.component.ApplicationComponent
import com.singh.daman.mvpkotlinexample.di.component.DaggerApplicationComponent

/**
 * Created by Daman on 2/3/2018.
 */
class InitApp : Application() {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        setupComponent()
    }

    private fun setupComponent() {
        applicationComponent = DaggerApplicationComponent.builder().build()
        applicationComponent.inject(this)
    }

    fun getApplication(context: Context): InitApp {
        return context.applicationContext as InitApp
    }
}
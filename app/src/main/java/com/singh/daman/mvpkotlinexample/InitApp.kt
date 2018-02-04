package com.singh.daman.mvpkotlinexample

import android.app.Application
import android.content.Context

/**
 * Created by Daman on 2/3/2018.
 */
class InitApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    fun getApplication(context: Context): InitApp {
        return context.applicationContext as InitApp
    }
}
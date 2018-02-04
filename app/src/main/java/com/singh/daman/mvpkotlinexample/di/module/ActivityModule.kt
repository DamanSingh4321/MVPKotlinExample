package com.singh.daman.mvpkotlinexample.di.module

import dagger.Module
import android.app.Activity
import android.content.Context
import android.support.v7.app.AppCompatActivity
import dagger.Provides



/**
 * Created by Daman on 2/4/2018.
 */

@Module
class ActivityModule {
    private lateinit var appCompatActivity: AppCompatActivity

    fun ActivityModule(appCompatActivity: AppCompatActivity) {
        this.appCompatActivity = appCompatActivity
    }

    @Provides
    fun provideContext(): Context {
        return appCompatActivity
    }

    @Provides
    fun provideActivity(): Activity {
        return appCompatActivity
    }


}
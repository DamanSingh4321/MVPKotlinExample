package com.singh.daman.mvpkotlinexample.di.component

import com.singh.daman.mvpkotlinexample.di.annotations.PerActivity
import com.singh.daman.mvpkotlinexample.di.module.ActivityModule
import com.singh.daman.mvpkotlinexample.ui.main.MainActivity
import dagger.Component

/**
 * Created by Daman on 2/4/2018.
 */

@PerActivity
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activityComponent: MainActivity)

}
package com.singh.daman.mvpkotlinexample.di.annotations

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Created by Daman on 2/4/2018.
 */
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class PerActivity
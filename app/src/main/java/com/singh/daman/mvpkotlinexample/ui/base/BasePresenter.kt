package com.singh.daman.mvpkotlinexample.ui.base

/**
 * Created by Daman on 2/3/2018.
 */
interface BasePresenter<in T:BaseView> {

    fun addView(view: T)
    fun removeView()
}
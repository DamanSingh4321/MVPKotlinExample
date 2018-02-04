package com.singh.daman.mvpkotlinexample.ui.base

import android.icu.lang.UCharacter.GraphemeClusterBreak.V



/**
 * Created by Daman on 2/3/2018.
 */

open class BasePresenterImpl<V:BaseView> : BasePresenter<V>{

    private var view: V? = null
    override fun addView(view: V) {
        this.view = view
    }

    override fun removeView() {
        view = null
    }

    fun isViewAttached(): Boolean = view != null

    fun getBaseView(): V? = view

}
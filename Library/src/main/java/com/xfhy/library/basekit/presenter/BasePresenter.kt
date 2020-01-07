package com.xfhy.library.basekit.presenter

import com.trello.rxlifecycle2.LifecycleProvider

/**
 * @author xfhy
 * time create at 2018/1/27 9:07
 * description
 */
open class BasePresenter : IPresenter{

    /**
     * 用于传入RxKotlin 避免内存泄露
     */
    lateinit var lifeProvider: LifecycleProvider<*>

    override fun onCreate() {
    }

    override fun onResume() {
    }

    override fun onDestroy() {
    }
}

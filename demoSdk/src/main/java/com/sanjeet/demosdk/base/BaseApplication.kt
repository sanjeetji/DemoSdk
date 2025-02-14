package com.sanjeet.demosdk.base

import android.app.Activity
import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import java.lang.ref.WeakReference


@HiltAndroidApp
class BaseApplication: Application()  {

    init {
        instance = this
    }

    companion object {
        lateinit var instance: BaseApplication
            private set
    }

}
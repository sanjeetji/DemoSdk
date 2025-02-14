package com.sanjeet.demosdk

import android.content.Context

object DemoSdk {

    internal fun initializeDemoSdk(context:Context,clientName:String,apiKey:String){
        println("Demo SDK initialized with clientName: $clientName and apiKey: $apiKey")
    }
}
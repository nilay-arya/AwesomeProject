package com.awesomeproject

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class CounterModule internal constructor(context: ReactApplicationContext?) :
    ReactContextBaseJavaModule(context) {
    override fun getName(): String {
        return "CounterModule"
    }

    @ReactMethod
    fun createCounterEvent() {
        Log.d("Counter Module", "Logged from CounterModule")
    }
}
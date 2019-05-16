package com.threecats.myinjection

import android.app.Application

class App : Application() {

    lateinit var ghosteryComponent: GhosteryComponent

    override fun onCreate() {
        super.onCreate()

        instance = this

        ghosteryComponent = DaggerGhosteryComponent.create()
    }

    companion object {
        lateinit var instance: App
    }
}

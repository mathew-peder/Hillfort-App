package org.wit.hillfortapp.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.hillfortapp.models.HillfortJSONStore
import org.wit.hillfortapp.models.HillfortStore

class MainApp : Application(), AnkoLogger {

    lateinit var hillforts: HillfortStore


    override fun onCreate() {
        super.onCreate()
        hillforts = HillfortJSONStore(applicationContext)
        info("Hillfort App started")
    }
}
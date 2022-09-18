package com.priyam.daggerconcepts

import android.app.Application
import com.priyam.daggerconcepts.component.AppComponent
import com.priyam.daggerconcepts.component.DaggerAppComponent
import com.priyam.daggerconcepts.component.UserRegistrationComponent

class UserApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }

}
package com.priyam.daggerconcepts

import android.app.Application
import com.priyam.daggerconcepts.component.UserRegistrationComponent

class UserApplication: Application() {

    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
//        userRegistrationComponent = .factory().create(3)
    }

}
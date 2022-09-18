package com.priyam.daggerconcepts

import android.app.Application
import com.priyam.daggerconcepts.component.DaggerUserRegistrationComponent
import com.priyam.daggerconcepts.component.UserRegistrationComponent

class UserApplication: Application() {

    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
<<<<<<< HEAD
//        userRegistrationComponent = .factory().create(3)
=======
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
>>>>>>> parent of d9aac22 (Revert "Analytics Service")
    }

}
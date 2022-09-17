package com.priyam.daggerconcepts

import dagger.Binds
import dagger.BindsInstance
import dagger.Component

/**MainActivity will get the object of UserRegistrationService through this component

getUserRegistrationService() is here to create object for UserRegistrationService class
 */

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {



    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int):  UserRegistrationComponent

    }

}


/***
VERSION 1
Initially, objects for UserRegistrationService and WelcomeEmail were created manually by these lines:

fun getUserRegistrationService(): UserRegistrationService

fun getWelcomeEmail() : WelcomeEmail

VERSION 2
But now, inject function replaces it. It gets the activity which needs the injection.

fun inject(mainActivity: MainActivity)
 */
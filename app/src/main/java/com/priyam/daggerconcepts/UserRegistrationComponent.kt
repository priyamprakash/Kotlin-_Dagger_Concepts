package com.priyam.daggerconcepts

import dagger.Component

/**MainActivity will get the object of UserRegistrationService through this component

getUserRegistrationService() is here to create object for UserRegistrationService class
 */

@Component
interface UserRegistrationComponent {



    fun inject(mainActivity: MainActivity)

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
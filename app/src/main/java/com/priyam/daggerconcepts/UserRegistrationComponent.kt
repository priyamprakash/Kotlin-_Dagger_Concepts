package com.priyam.daggerconcepts

import dagger.Component

/**MainActivity will get the object of UserRegistrationService through this component

getUserRegistrationService() is here to create object for UserRegistrationService class
 */

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService
}



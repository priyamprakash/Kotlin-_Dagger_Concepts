package com.priyam.daggerconcepts.component

import com.priyam.daggerconcepts.*
import com.priyam.daggerconcepts.modules.NotificationServiceModule
import com.priyam.daggerconcepts.modules.AnalyticsModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

/**MainActivity will get the object of UserRegistrationService through this component

getUserRegistrationService() is here to create object for UserRegistrationService class
 */

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {



    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent

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

//@Component.Builder
//    interface Builder{
//        fun build() : UserRegistrationComponent
//        fun retryCount(@BindsInstance retryCount: Int) : Builder
//        fun subComponent(appComponent: AppComponent) : Builder
//    }
package com.priyam.daggerconcepts.component

import com.priyam.daggerconcepts.modules.AnalyticsModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationComponentFactory() : UserRegistrationComponent.Factory
}


//    fun getUserRegistrationComponentBuilder() : UserRegistrationComponent.Builder
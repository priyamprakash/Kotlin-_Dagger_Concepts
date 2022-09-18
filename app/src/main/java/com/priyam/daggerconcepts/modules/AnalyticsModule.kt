package com.priyam.daggerconcepts.modules

import com.priyam.daggerconcepts.AnalyticsService
import com.priyam.daggerconcepts.Mixpanel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticsService{
        return Mixpanel()
    }
}
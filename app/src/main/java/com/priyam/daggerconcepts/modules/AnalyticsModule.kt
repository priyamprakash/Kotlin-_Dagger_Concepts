package com.priyam.daggerconcepts.modules

import com.priyam.daggerconcepts.AnalyticsService
import com.priyam.daggerconcepts.Mixpanel
import dagger.Module
import dagger.Provides


@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService(): AnalyticsService{
        return Mixpanel()
    }
}
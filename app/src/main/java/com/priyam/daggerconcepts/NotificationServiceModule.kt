package com.priyam.daggerconcepts

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService(): NotificationService{
        return MessageService()
    }

}


/**
Similar to UserRepositoryModule
Here it means to use MessageService class for the NotificationService interface
 */
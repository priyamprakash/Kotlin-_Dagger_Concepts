package com.priyam.daggerconcepts

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Qualifiers - @Named
 Since, NotificationServiceModule was confused between service and message class
 as both belong to NotificationService.

So, if in case objects of 2 or more classes of the same interface are being instantiated in the
module, we need to classify which specific class needs to be called using @Named annotation as qualifier.


 */
@Module
class NotificationServiceModule {

    @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService{
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService{
        return EmailService()
    }

}


/**
Similar to UserRepositoryModule
Here it means to use MessageService class for the NotificationService interface
 */
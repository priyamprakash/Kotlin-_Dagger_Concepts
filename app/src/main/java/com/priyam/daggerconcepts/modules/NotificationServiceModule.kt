package com.priyam.daggerconcepts.modules

import com.priyam.daggerconcepts.EmailService
import com.priyam.daggerconcepts.MessageQualifier
import com.priyam.daggerconcepts.MessageService
import com.priyam.daggerconcepts.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Qualifiers - @Named
 Since, NotificationServiceModule was confused between service and message class
 as both belong to NotificationService.

So, if in case objects of 2 or more classes of the same interface are being instantiated in the
module, we need to classify which specific class needs to be called using @Named annotation as qualifier.


 */

/**  RETRY COUNT

For version 4 of Main Activity,

>> class NotificationServiceModule(private val retryCount: Int)

For version 5 of Main Activity,

>> class NotificationServiceModule

>> getMessageService(retryCount: Int)

Reason: getMessageService will get the value directly from the component becasue component Factory
is created and MainActivity will share the value through it.
 */
@Module
class NotificationServiceModule() {

    @Singleton
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int): NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return EmailService()
    }

}


/**
Similar to UserRepositoryModule
 */
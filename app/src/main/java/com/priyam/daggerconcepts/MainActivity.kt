package com.priyam.daggerconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import javax.inject.Inject

/**
 * Factory and Builder
 */
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val appComponent = (application as UserApplication).appComponent
        val userRegistrationComponent = appComponent.getUserRegistrationComponentFactory().create(3)
        userRegistrationComponent.inject(this)


        userRegistrationService.registerUser("Falooda@gmail.com", "123456")

    }
}


/***
VERSION 1
val userRepository  = UserRepository()
val welcomeEmail = WelcomeEmail()
val userRegistrationService = UserRegistrationService(userRepository, welcomeEmail)

VERSION 2

With the help of Dagger,these lines are replaced by :

val component = DaggerUserRegistrationComponent.builder().build()
val userRegistrationService = component.getUserRegistrationService()
val welcomeEmail = component.getWelcomeEmail()

VERSION 3

Now, the objects of userRegistrationService & welcomeEmail need not be created manually
(Reason : Because we have defined inject function in the VERSION 2 UserRegistrationComponent )
So, the last 2 lines of above version can be replaced by :

@Inject
lateinit var userRegistrationService: UserRegistrationService

val component = DaggerUserRegistrationComponent.builder().build()
component.inject(this)

VERSION 4

Till now Dagger was itself creating object of modules
But now we wish to pass retryCount to the NotificationServiceModule from the User side
So we are adding one more line while creating component.

val component = DaggerUserRegistrationComponent.builder()
.notificationServiceModule(NotificationServiceModule(3))
.build()

Here, retryCount is a dynamic value being passed by the user.
Dynamic value is passed from the MainActivity to the NotificationServiceModule.
It will be used in the MessageService class of NotificationService.

VERSION 5
 Further, if we forget to add:
.notificationServiceModule(NotificationServiceModule(3))
 Android Studio shows no error during compilation, but throws error during runtime.

To avoid this we use Component Factory which makes sure (during compilation itself) that you pass the dynamic value.
Also code to create component in MainActivity changes to :

>> val component = DaggerUserRegistrationComponent.factory().create(3)

 */
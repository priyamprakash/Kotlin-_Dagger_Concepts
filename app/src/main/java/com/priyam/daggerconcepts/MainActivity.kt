package com.priyam.daggerconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

//Initial Setup Done
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)

//      this registerUser function of userRegistrationService calls : 1. User Repository and 2. Notification Service
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

 */
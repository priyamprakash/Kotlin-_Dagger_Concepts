package com.priyam.daggerconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Initial Setup Done
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        val welcomeEmail = component.getWelcomeEmail()

        userRegistrationService.registerUser("Falooda@gmail.com", "123456")

    }
}


/***
val userRepository  = UserRepository()
val welcomeEmail = WelcomeEmail()
val userRegistrationService = UserRegistrationService(userRepository, welcomeEmail)

With the help of Dagger,these lines are replaced by :

val component = DaggerUserRegistrationComponent.builder().build()
val userRegistrationService = component.getUserRegistrationService()
val welcomeEmail = component.getWelcomeEmail()

 */
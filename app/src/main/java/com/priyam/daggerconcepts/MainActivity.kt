package com.priyam.daggerconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Initial Setup Done
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val userRepository  = UserRepository()
        val welcomeEmail = WelcomeEmail()

        val userRegistrationService = UserRegistrationService(userRepository, welcomeEmail)
        userRegistrationService.registerUser("Falooda@gmail.com", "123456")

    }
}
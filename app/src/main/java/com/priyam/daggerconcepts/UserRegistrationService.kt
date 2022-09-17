package com.priyam.daggerconcepts

class UserRegistrationService {
    private val userRepository = UserRepository()
    private val welcomeEmail = WelcomeEmail()

    fun registerUser(email: String , password:String){
        userRepository.saveUser(email, password)
        welcomeEmail.send(email, "pp@gmail.com", "User Registered")
    }
}
package com.priyam.daggerconcepts

class UserRegistrationService {
    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(email: String , password:String){
        userRepository.saveUser(email, password)
        emailService.send(email, "pp@gmail.com", "User Registered")
    }
}
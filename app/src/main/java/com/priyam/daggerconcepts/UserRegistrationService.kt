package com.priyam.daggerconcepts

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {

        userRepository.saveUser(email, password)

        notificationService.send(email, "pp@gmail.com", "User Registered")
    }
}
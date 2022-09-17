package com.priyam.daggerconcepts

import com.priyam.daggerconcepts.MessageQualifier
import com.priyam.daggerconcepts.NotificationService
import com.priyam.daggerconcepts.UserRepository
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {

        userRepository.saveUser(email, password)

        notificationService.send(email, "pp@gmail.com", "User Registered")
    }
}
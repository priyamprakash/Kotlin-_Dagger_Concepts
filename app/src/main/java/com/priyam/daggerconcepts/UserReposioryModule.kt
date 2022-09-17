package com.priyam.daggerconcepts

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}

//1st code
/**
@Provides
fun getFirebaseRepository(): UserRepository{
return FirebaseRepository()
}

This means that whenever you want to call UserRepository, the UserRepository interface will call
the FirebaseRepository Class (and not the SQL)
 */

//2nd code
/**
@Binds
abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository


This means that whenever you want to call UserRepository, SQLRepository gets called
 For @Binds annotation function and class needs to be abstract
 */
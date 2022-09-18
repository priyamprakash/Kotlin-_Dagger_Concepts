package com.priyam.daggerconcepts


import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface  UserRepository{
    fun saveUser(email:String , password: String)
}

@Singleton
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d("TAG1", "saveUser: User Saved in DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d("TAG1", "saveUser: User Saved in Firebase")
        analyticsService.trackEvent("Save User" , "CREATE")
    }
}
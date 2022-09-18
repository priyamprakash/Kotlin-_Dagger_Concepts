package com.priyam.daggerconcepts


import android.util.Log
import javax.inject.Inject

interface  UserRepository{
    fun saveUser(email:String , password: String)
}

@ActivityScope
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
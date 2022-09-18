package com.priyam.daggerconcepts


import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface  UserRepository{
    fun saveUser(email:String , password: String)
}

@Singleton
class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d("TAG1", "saveUser: User Saved in DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d("TAG1", "saveUser: User Saved in Firebase")
    }
}
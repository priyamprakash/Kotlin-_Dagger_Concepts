package com.priyam.daggerconcepts


import android.content.ContentValues.TAG
import android.util.Log

class UserRepository {
    fun saveUser(email: String, password: String){
        Log.d(TAG, "saveUser: User Saved in DB")
    }
}
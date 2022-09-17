package com.priyam.daggerconcepts


import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String){
        Log.d("TAG1", "saveUser: User Saved in DB")
    }
}
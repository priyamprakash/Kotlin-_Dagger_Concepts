package com.priyam.daggerconcepts

import android.content.ContentValues.TAG
import android.util.Log

class WelcomeEmail {
    fun send(to : String , from : String , body : String){
        Log.d(TAG, "send: Email Sent")
    }
}
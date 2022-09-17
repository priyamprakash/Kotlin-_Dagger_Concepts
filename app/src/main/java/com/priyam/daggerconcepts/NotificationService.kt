package com.priyam.daggerconcepts

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
interface  NotificationService{
    fun send(to: String , from:String, body: String?)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("TAG1", "send: Email Sent")
    }
}

class MessageService(private val retryCount : Int): NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d("TAG1", "send: Message Sent - Retry Count $retryCount")
    }

}
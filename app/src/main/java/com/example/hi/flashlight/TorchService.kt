package com.example.hi.flashlight

import android.app.Service
import android.content.Intent
import android.os.IBinder

class TorchService : Service() {

    private val torch: Torch by lazy{
        Torch(this)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when(intent?.action){
            //앱에서 실행하는 경우
            "on" -> {
                torch.flashOn()
            }
            "off" -> {
                torch.flashOff()
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }


    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}

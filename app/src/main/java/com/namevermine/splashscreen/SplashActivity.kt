package com.namevermine.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private lateinit var handler : Handler
    private lateinit var intentMain : Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler()

        intentMain = Runnable {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }

        handler.postDelayed(intentMain,1000)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(intentMain)
    }
}

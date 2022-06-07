package com.example.ricopriyono12

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import androidx.appcompat.app.AppCompatActivity


class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //menghilangkan ActionBar
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_welcome_screen)
        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }, 3000L) //3000 L = 3 detik
    }
}
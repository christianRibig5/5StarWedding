package com.riibig5.weddingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    //private val SPLASH_TIME_OUT:Long = 3000 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val animation: Animation =AnimationUtils.loadAnimation(this,R.anim.anim_1)
        val animation2: Animation =AnimationUtils.loadAnimation(this,R.anim.anim_2)
        welcome_text.animation=animation
        splash_icon.animation=animation
        splash_button.animation=animation2
        Handler().postDelayed({
            gotoDashboardActivity()
        }, 10000 )
    initEventListeners()
    }

    private fun initEventListeners() {
        splash_button.setOnClickListener{
            gotoDashboardActivity()
        }
    }


    private fun gotoDashboardActivity() {
        val intent=Intent(this,DashboardActivity::class.java)
        startActivity(intent)
        finish()
    }
}

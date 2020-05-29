package com.riibig5.weddingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.dashboard_main.*
import kotlinx.android.synthetic.main.navigable_drawer.*

class DashboardActivity : AppCompatActivity() {

    private lateinit var drawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        setupDrawer()
        initEventListeners()
    }

    private fun initEventListeners() {
        closeDrawer.setOnClickListener{
            drawerLayer.closeDrawer(GravityCompat.START)
        }
        reception_program.setOnClickListener{
            gotoReceptionProgramActivity()
        }
    }

    private fun gotoReceptionProgramActivity() {

    }

    private fun setupDrawer() {
        supportActionBar?.title = ""
        drawerToggle = ActionBarDrawerToggle(this, drawerLayer, toolbarIcon,
            R.string.app_name, R.string.app_name)
        drawerLayer.addDrawerListener(drawerToggle)
        drawerToggle.setToolbarNavigationClickListener {
            drawerLayer.openDrawer(GravityCompat.START)
        }
        drawerToggle.isDrawerIndicatorEnabled = false
        drawerToggle.syncState()
        drawerToggle.setHomeAsUpIndicator(R.drawable.toolbar_img)
    }
}

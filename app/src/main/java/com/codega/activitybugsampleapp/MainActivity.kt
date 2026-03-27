package com.codega.activitybugsampleapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode

class MainActivity : AppCompatActivity() {

    private val actionModeCallback = object : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode, menu: Menu): Boolean {
            return true
        }
        override fun onPrepareActionMode(mode: ActionMode, menu: Menu): Boolean {
            return false
        }
        override fun onActionItemClicked(mode: ActionMode, item: MenuItem): Boolean {
            return false
        }
        override fun onDestroyActionMode(mode: ActionMode) { }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        val startButton = findViewById<Button>(R.id.start_action_mode_button)
        startButton.setOnClickListener {
            startSupportActionMode(actionModeCallback)
        }
    }
}
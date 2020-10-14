package com.example.motionlayout_lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonToConverted).setOnClickListener {
            startActivity(Intent(this, ConvertMeActivity::class.java))
        }
        findViewById<Button>(R.id.buttonToOnSwipe).setOnClickListener {
            startActivity(Intent(this, SwipeHandlerActivity::class.java))
        }
        findViewById<Button>(R.id.toKeyFrames).setOnClickListener {
            startActivity(Intent(this, KeyframesActivity::class.java))
        }
        findViewById<Button>(R.id.toFoldedCard).setOnClickListener {
            startActivity(Intent(this, FoldedCardActivity::class.java))
        }
        findViewById<Button>(R.id.toRecyclerView).setOnClickListener {
            startActivity(Intent(this, TwitterTopAppBar::class.java))
        }
        findViewById<Button>(R.id.toMultiStateMotion).setOnClickListener {
            startActivity(Intent(this, MultiStateActivity::class.java))
        }
    }
}
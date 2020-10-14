package com.example.motionlayout_lesson1

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.utils.widget.ImageFilterView

class FoldedCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_folded_card)
        findViewById<ImageFilterView>(R.id.front_cover).apply {
            cameraDistance = 6000 * resources.displayMetrics.density
        }
        findViewById<View>(R.id.back_cover).cameraDistance = 6000 * resources.displayMetrics.density
        findViewById<View>(R.id.front_cover).pivotY = 1.0f
        findViewById<View>(R.id.back_cover).pivotY = 1.0f

    }
}

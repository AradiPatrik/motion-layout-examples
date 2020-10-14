package com.example.motionlayout_lesson1

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.utils.widget.ImageFilterView

class ToggleableImageFilterView@JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ImageFilterView(context, attrs, defStyleAttr) {
    fun toggle() {
        crossfade = if (crossfade > 0.5) {
            0.0f
        } else {
            1.0f
        }
    }
}
package com.demo.nw

import android.app.Activity
import android.graphics.drawable.Animatable
import android.os.Bundle
import android.widget.ImageView

class MainActivity : Activity() {
    private val animatedVectorIv: ImageView by lazy {
        findViewById(R.id.animated_vector_iv)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animatedVectorIv.setOnClickListener {
            ((it as? ImageView)?.drawable as? Animatable)?.start()
        }
    }
}
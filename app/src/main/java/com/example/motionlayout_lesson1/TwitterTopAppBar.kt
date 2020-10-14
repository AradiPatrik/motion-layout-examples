package com.example.motionlayout_lesson1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TwitterTopAppBar : AppCompatActivity(R.layout.activity_recycler_view) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<RecyclerView>(R.id.theRecyclerView).layoutManager = LinearLayoutManager(this)
        findViewById<RecyclerView>(R.id.theRecyclerView).adapter = CatAdapter().apply {
            submitList(
                listOf(
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings"
                )
            )
        }
    }
}
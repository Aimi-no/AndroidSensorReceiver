package com.example.sensorreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var started = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClick(v: View?){
        if(!started) {
            txtBox.text = "Started"
            started = true
        }
        else{
            txtBox.text = "Stopped"
            started = false
        }

    }

    



}

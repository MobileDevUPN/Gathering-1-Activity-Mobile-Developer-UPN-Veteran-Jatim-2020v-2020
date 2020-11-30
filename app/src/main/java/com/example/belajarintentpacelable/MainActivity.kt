package com.example.belajarintentpacelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntentParcelable = findViewById<Button>(R.id.btn_Intent_Parcelable)

        btnIntentParcelable.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_Intent_Parcelable -> run{
                val user = User(
                        "Muhammad Rima M. Bil Ashar", 20, "Teknik Informatika", "FIK"
                )

                val IntentParcelable = Intent(this@MainActivity, ActivityBaru::class.java)
                IntentParcelable.putExtra(ActivityBaru.EXTRA_USER, user)
                startActivity(IntentParcelable)


            }

        }
    }
}
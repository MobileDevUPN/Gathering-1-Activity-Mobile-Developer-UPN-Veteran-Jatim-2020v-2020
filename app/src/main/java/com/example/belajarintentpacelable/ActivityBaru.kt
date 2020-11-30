package com.example.belajarintentpacelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityBaru : AppCompatActivity() {

    private lateinit var hasilParcelable : TextView

    companion object{
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baru)

        hasilParcelable = findViewById(R.id.hasil_Parcelable)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        val text = "Nama : ${user.nama.toString()} \nUmur : ${user.umur} \nJurusan ${user.Jurusan} \nFakultas : ${user.Fakultas}"

        hasilParcelable.text = text
    }
}
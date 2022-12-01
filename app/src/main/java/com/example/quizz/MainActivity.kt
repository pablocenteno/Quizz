package com.example.quizz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun siguiente_listar(view: View){
        intent = Intent(this, ListarPreguntas::class.java)

        startActivity(intent)
    }


    fun abrir_web(view: View){
        intent = Uri.parse("https://aulavirtual33.educa.madrid.org/ies.goya.madrid/").let {
            webpage -> Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(intent)
    }
}
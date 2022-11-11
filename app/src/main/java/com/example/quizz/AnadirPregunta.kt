package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class AnadirPregunta : AppCompatActivity() {

    lateinit var preguntilla: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anadir_pregunta)

        preguntilla= findViewById<EditText>(R.id.introPregunta)
    }

    fun siguiente(view: View){

        intent = Intent(this, AnadirRespuestas::class.java).apply {
            putExtra("pregunta", preguntilla.text.toString())
        }

        startActivity(intent)
    }
}
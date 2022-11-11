package com.example.quizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarPregunta : AppCompatActivity() {

    lateinit var preguntas: ListarPreguntasProvider
    lateinit var consulta: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_pregunta)

        consulta = findViewById<TextView>(R.id.respuestas).text.toString()

    }



}
package com.example.quizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarPregunta : AppCompatActivity() {

    lateinit var preguntas: ListarPreguntasProvider
    lateinit var consulta: TextView
    lateinit var id :String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_pregunta)

        consulta = findViewById<TextView>(R.id.respuestas)
        id = intent.getStringExtra("id").toString()
        val verConsulta = preguntas.obtenerPregunta(id)

        consulta.text=verConsulta.getString(1)

    }



}
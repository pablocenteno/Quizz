package com.example.quizz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class AnadirRespuestas : AppCompatActivity() {

    lateinit var pregunta: String
    lateinit var resp1: EditText
    lateinit var resp2: EditText
    lateinit var resp3: EditText
    lateinit var resp4: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anadir_respuestas)
        pregunta= intent.getStringExtra("pregunta").toString()

        resp1 = findViewById<EditText>(R.id.respuesta1)
        resp2 = findViewById<EditText>(R.id.respuesta2)
        resp3 = findViewById<EditText>(R.id.respuesta3)
        resp4 = findViewById<EditText>(R.id.respuesta4)


    }

    fun siguiente(view: View){

        if(pregunta.equals("") || resp1.text.toString().equals("")
            || resp2.text.toString().equals("") || resp3.text.toString().equals("") || resp4.text.toString().equals(""))
        {
            Toast.makeText(this, "Lo siento no puede haber campos vacios.", Toast.LENGTH_SHORT).show()
        }

        else{
            var tabla = ListarPreguntasProvider(this, null)
            tabla.crearPregunta(pregunta, resp1.toString(), resp2.toString(),resp3.toString(), resp4.toString())

            intent = Intent(this, ListarPreguntas::class.java)
            startActivity(intent)
        }
    }
}
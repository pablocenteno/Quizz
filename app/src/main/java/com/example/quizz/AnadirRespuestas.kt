package com.example.quizz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.quizz.databinding.ActivityAnadirRespuestasBinding

class AnadirRespuestas : AppCompatActivity() {

    lateinit var pregunta: String
    lateinit var resp1: EditText
    lateinit var resp2: EditText
    lateinit var resp3: EditText
    lateinit var resp4: EditText

//    private lateinit var binding: ac
        private  lateinit var binding: ActivityAnadirRespuestasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAnadirRespuestasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pregunta= intent.getStringExtra("pregunta").toString()

        resp1 = binding.respuesta1
        resp2 = binding.respuesta2
        resp3 = binding.respuesta3
        resp4 = binding.respuesta4


    }

    fun siguiente(view: View){

        if(pregunta.equals("") || resp1.text.toString().equals("")
            || resp2.text.toString().equals("") || resp3.text.toString().equals("") || resp4.text.toString().equals(""))
        {
            Toast.makeText(this, "Lo siento no puede haber campos vacios.", Toast.LENGTH_SHORT).show()
        }

        else{
            var tabla = ListarPreguntasProvider(this, null)
            val lista = mutableListOf<String>()
            tabla.crearPregunta(pregunta, resp1.text.toString(), resp2.text.toString(),resp3.text.toString(), resp4.text.toString())
            lista.add(pregunta)
            lista.add(resp1.text.toString())
            lista.add(resp2.text.toString())
            lista.add(resp3.text.toString())
            lista.add(resp4.text.toString())
            intent = Intent(this, ListarPreguntas::class.java)
            startActivity(intent)
        }
    }

    fun borrar1(view: View){
        resp1.setText("")
    }

    fun borrar2(view: View){
        resp2.setText("")
    }

    fun borrar3(view: View){
        resp3.setText("")
    }

    fun borrar4(view: View){
        resp4.setText("")
    }
}
package com.example.quizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.quizz.databinding.ActivityMostrarPreguntaBinding

class MostrarPregunta : AppCompatActivity() {

    lateinit var preguntas: ListarPreguntasProvider
    lateinit var pregunta: TextView
    lateinit var respuestas: TextView
    private lateinit var binding: ActivityMostrarPreguntaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMostrarPreguntaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preguntas = ListarPreguntasProvider(this, null)
        pregunta= binding.preguntona
        respuestas = binding.respuestas
        var id = intent.getIntExtra("id",0)
        val verConsulta = preguntas.obtenerPregunta(id)

        pregunta.text=verConsulta.getString(1)

        var res = "" + verConsulta.getString(2)
        res = res + "\n" + verConsulta.getString(3)
        res = res + "\n" + verConsulta.getString(4)
        res = res + "\n" + verConsulta.getString(5)

        respuestas.text=res

    }



}
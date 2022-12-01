package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.quizz.databinding.ActivityAnadirPreguntaBinding

class AnadirPregunta : AppCompatActivity() {

    lateinit var preguntilla: EditText
    private lateinit var binding: ActivityAnadirPreguntaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAnadirPreguntaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preguntilla= binding.introPregunta
    }

    fun siguiente(view: View){

        intent = Intent(this, AnadirRespuestas::class.java).apply {
            putExtra("pregunta", preguntilla.text.toString())
        }

        startActivity(intent)
    }

    fun borrar(view: View){
        preguntilla.setText("")
    }
}
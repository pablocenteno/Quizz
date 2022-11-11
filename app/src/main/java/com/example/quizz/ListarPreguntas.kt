package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizz.adapter.ListarPreguntasAdapter

class ListarPreguntas : AppCompatActivity() {


    private lateinit var preguntas: ListarPreguntasProvider
    private lateinit var adapter: ListarPreguntasAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler)
        preguntas = ListarPreguntasProvider(this, null)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager= LinearLayoutManager(this)

        val cursor= preguntas.obtenerPreguntas()
        adapter = ListarPreguntasAdapter(onClickListener = { pos -> dameID(pos) },)
        adapter.ListarPreguntasAdapter(this, cursor)

        recyclerView.adapter=adapter
    }

    fun siguiente(view: View){

        intent = Intent(this, AnadirPregunta::class.java)

        startActivity(intent)
    }

    fun dameID(pos: String)
    {
        intent = Intent(this, MostrarPregunta::class.java).apply {
            putExtra("id", pos)
        }

        startActivity(intent)
    }


}
package com.example.quizz.adapter

import android.content.Context
import android.database.Cursor
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizz.R

class ListarPreguntasAdapter( private val onClickListener: (String) -> Unit) : RecyclerView.Adapter<ListarPreguntasViewHolder>() {

    lateinit var context: Context
    lateinit var cursor: Cursor

    fun ListarPreguntasAdapter(context: Context, cursor: Cursor)
    {
        this.context = context
        this.cursor = cursor
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListarPreguntasViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return ListarPreguntasViewHolder(layoutInflater.inflate(R.layout.preguntas, parent, false))
    }

    override fun onBindViewHolder(holder: ListarPreguntasViewHolder, position: Int) {
        cursor.moveToPosition(position)
        holder. render(cursor.getInt(0),cursor.getString(1), onClickListener/* onClickDelete*/)
    }

    override fun getItemCount(): Int {
       return cursor.count
    }
}
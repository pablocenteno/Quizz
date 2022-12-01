package com.example.quizz.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizz.R

class ListarPreguntasViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    val id_pregunta: TextView = itemView.findViewById(R.id.id_preg)
    val pregunta: TextView = itemView.findViewById(R.id.preg)

    fun render(
        id_preg: Int, preg: String,
        onClickListener: (Int) -> Unit
        /*,onClickDelete: (String) -> Unit*/)
    {
        id_pregunta.text=id_preg.toString()
        pregunta.text = preg.toString()


        pregunta.setOnClickListener {
            onClickListener(id_preg)
        }

        /*buttonBorrar.setOnClickListener{
            onClickDelete(pregunta_id.text.toString())
        }*/
    }


}
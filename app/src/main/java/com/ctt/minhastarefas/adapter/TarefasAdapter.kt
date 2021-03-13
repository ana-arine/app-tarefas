package com.ctt.minhastarefas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.minhastarefas.R

import com.ctt.minhastarefas.model.Tarefa

class TarefasAdapter(private val listaTarefas: MutableList<Tarefa>) :
        RecyclerView.Adapter<TarefasAdapter.AdapterViewHolder>() {

    class AdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val itemTitulo: TextView = itemView.findViewById(R.id.txtTitulo)
        private val itemConteudo: TextView = itemView.findViewById(R.id.txtConteudo)

        fun bind(tarefa: Tarefa) {
            itemTitulo.text = tarefa.titulo
            itemConteudo.text = tarefa.descricao

        }
    }

    //criar cada item visual na tela
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tarefa, parent, false)
        return AdapterViewHolder(view)

    }

    //popular o item na lista do RV. Executado a cada passagem de item
    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.bind(listaTarefas[position])
    }

    //método público para a Main acessar o adapter
    fun updateList(list: List<Tarefa>) {
        this.listaTarefas.clear()
        this.listaTarefas.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = listaTarefas.size

}
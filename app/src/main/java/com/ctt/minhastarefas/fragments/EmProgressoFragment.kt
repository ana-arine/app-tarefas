package com.ctt.minhastarefas.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.minhastarefas.MainActivity.Companion.adapterEmProgresso
import com.ctt.minhastarefas.R
import com.ctt.minhastarefas.adapter.TarefasAdapter
import com.ctt.minhastarefas.model.Tarefa

class EmProgressoFragment : Fragment() {
    private val CICLO_VIDA = "CICLO_VIDA"
//    private lateinit var botaoCadastrar: Button
//    private lateinit var tituloTarefa: EditText
//    private lateinit var descricaoTarefa: EditText

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_progresso, container, false)

//        Log.e(CICLO_VIDA, "App em OnCreate")
//        if (listaTarefas.isNullOrEmpty()) {
//            Log.e(CICLO_VIDA, "Não tem tarefas pra fazer")
//            return inflater.inflate(R.layout.fragment_fazer_empty, container, false)
//        } else {
//            Log.e(CICLO_VIDA, "Tem tarefas pra fazer")
//            return inflater.inflate(R.layout.fragment_fazer, container, false)
//        }
    }

    //APós a fragment ser criada
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvEmProgresso = view.findViewById<RecyclerView>(R.id.listaProgresso)
        rvEmProgresso.adapter = adapterEmProgresso
        rvEmProgresso.layoutManager = LinearLayoutManager(requireContext())
    }
}